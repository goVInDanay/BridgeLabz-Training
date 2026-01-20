package dsa_practice.scenario_based;

import java.util.*;

public class ExamProctor {
	Stack<Integer> stack = new Stack<Integer>();
	Map<Integer, String> studentAnswers = new HashMap<Integer, String>();
	
	public void visitQuestion(int id) {
		stack.push(id);
		System.out.println("Visited question: " + id);
	}
	
	public int goBack() {
		if(!stack.isEmpty()) {
			int id = stack.pop();
			System.out.println("Went back to question: " + id);
			return id;
		}
		System.out.println("No previous question");
		return -1;
	}
	
	public void submitAnswer(int id, String ans) {
		if(!stack.isEmpty()) {
			studentAnswers.put(id, ans);
			System.out.println("Submitted");
		}
	}
	
	public int getLastVisited() {
		if(!stack.isEmpty()) {
			return stack.peek();
		}
		System.out.println("No previous question");
		return -1;
	}
	
	public int calculateScore(Map<Integer, String> correctAnswers) {
		int score = 0;
		for(Map.Entry<Integer, String> map : correctAnswers.entrySet()) {
			int id = map.getKey();
			String correctAns = map.getValue();
			String studentAns = studentAnswers.get(id);
			if(correctAns.equalsIgnoreCase(studentAns)) {
				score++;
			}
		}
		return score;
	}
	
	public void displayAnswers() {
		System.out.println("Student answers: ");
		for(Map.Entry<Integer, String> map : studentAnswers.entrySet()) {
			System.out.println(map.getKey() + " : " + map.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamProctor exam = new ExamProctor();
		
		Map<Integer, String> correctAnswers = new HashMap<Integer, String>();
		correctAnswers.put(1, "A");
		correctAnswers.put(2, "B");
		correctAnswers.put(3, "D");
		correctAnswers.put(4, "C");
		
		exam.visitQuestion(1);
		exam.submitAnswer(1, "A");
		
		exam.visitQuestion(2);
		exam.submitAnswer(2, "B");
		
		exam.visitQuestion(3);
		exam.submitAnswer(3, "C");
		
		exam.goBack();
		exam.submitAnswer(3, "D");
		
		exam.visitQuestion(4);
		exam.submitAnswer(4, "C");
		
		exam.displayAnswers();
		System.out.println("Score: " + exam.calculateScore(correctAnswers) + "/" + correctAnswers.size());
		
	}

}
