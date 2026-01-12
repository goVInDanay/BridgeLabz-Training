package oops_practice.scenario_based.online_exam_system;

class ObjectiveEvaluation implements EvaluationStratergy {
	
	@Override
	public int evaluate(Question[] questions, String[] answers) {
		// TODO Auto-generated method stub
		int score = 0;
		for(int i = 0; i < questions.length; i++) {
			if (answers[i].equals(questions[i].getCorrectAnswer())) {
				score += questions[i].getMarks();
			}
		}
		return score;
	}
}
