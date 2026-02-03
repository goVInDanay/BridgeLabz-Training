package com.bridgelabz.io.json_data_handling.ipl_censor_analyzer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class IPLCensorAnalyzer {

	public static String censorTeamName(String teamName) {
		if (teamName == null || teamName.isEmpty()) {
			return teamName;
		}
		String team[] = teamName.split("\\s+");
		return team[0] + " *** ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectMapper mapper = new ObjectMapper();
			File jsonFile = new File("src/json_matches.json");
			JsonNode root = mapper.readTree(jsonFile);
			if (root.isArray()) {
				for (JsonNode node : root) {
					ObjectNode match = (ObjectNode) node;
					match.put("team1", censorTeamName(match.get("team1").asText()));
					match.put("team2", censorTeamName(match.get("team2").asText()));
					match.put("winner", censorTeamName(match.get("winner").asText()));
					match.put("player_of_match", "REDACTED");
					JsonNode scoreNode = match.get("score");
					if (scoreNode != null && scoreNode.isObject()) {
						ObjectNode newScore = mapper.createObjectNode();
						Iterator<String> fields = scoreNode.fieldNames();
						while (fields.hasNext()) {
							String team = fields.next();
							int score = scoreNode.get(team).asInt();
							newScore.put(censorTeamName(team), score);
						}
						match.set("score", newScore);
					}
				}
			}

			mapper.writeValue(new File("src/censored_json_matches.json"), root);

			System.out.println("Censored JSON written successfully!");

			String inputCsv = "src/ipl_matches.csv";
			String outputCsv = "src/ipl_matches_censored.csv";
			try (BufferedReader br = new BufferedReader(new FileReader(inputCsv));
					BufferedWriter bw = new BufferedWriter(new FileWriter(outputCsv))) {
				String headerLine = br.readLine();
				if (headerLine == null) {
					return;
				}
				bw.write(headerLine);
				bw.newLine();
				String line;
				while ((line = br.readLine()) != null) {
					String[] fields = line.split(",");
					fields[1] = censorTeamName(fields[1]);
					fields[2] = censorTeamName(fields[2]);
					fields[5] = censorTeamName(fields[5]);
					fields[6] = "REDACTED";
					bw.write(String.join(",", fields));
					bw.newLine();
				}
			}
			System.out.println("Censored CSV written successfully!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
