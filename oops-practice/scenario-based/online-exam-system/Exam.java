package oops_practice.scenario_based.online_exam_system;

class Exam {
	private Question questions[];
	private int duration;

	Exam(Question questions[], int duration) {
		this.questions = questions;
		this.duration = duration;
	}

	public Question[] getQuestions() {
		return questions;
	}

	public int getDuration() {
		return duration;
	}

	public int submitExam(Student student, String answers[], int timeTaken, EvaluationStratergy evaluationStratergy)
			throws ExamTimeExpiredException {
		if (timeTaken > duration) {
			throw new ExamTimeExpiredException("Exam Time Expired for " + student.getName());
		}
		return evaluationStratergy.evaluate(questions, answers);
	}
}
