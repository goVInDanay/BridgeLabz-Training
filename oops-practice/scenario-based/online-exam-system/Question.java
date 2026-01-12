package oops_practice.scenario_based.online_exam_system;

class Question {
	private String correctAnswer;
	private int marks;

	Question(String correctAnswer, int marks) {
		this.correctAnswer = correctAnswer;
		this.marks = marks;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public int getMarks() {
		return marks;
	}
}
