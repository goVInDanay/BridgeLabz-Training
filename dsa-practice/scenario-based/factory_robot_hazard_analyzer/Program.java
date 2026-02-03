package dsa_practice.scenario_based.factory_robot_hazard_analyzer;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Arm Precision (0.0 - 1.0):");
			double armPrecision = Double.parseDouble(sc.nextLine());
			System.out.println("Enter Worker Density (1 - 20):");
			int workerDensity = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
			String machineryState = sc.nextLine();
			RobotHazardAuditor auditor = new RobotHazardAuditor();
			double risk = auditor.calculateHazardRisk(armPrecision, workerDensity, machineryState);
			System.out.println("Robot Hazard Risk Score: " + risk);
		} catch (RobotSafetyException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid input format.");
		}
	}
}
