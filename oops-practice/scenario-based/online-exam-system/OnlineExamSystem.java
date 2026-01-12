package oops_practice.scenario_based.online_exam_system;

public class OnlineExamSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1, "Govind");

		Question questions[] = { new Question("A", 5), new Question("B", 15) };

		Exam exam = new Exam(questions, 10);
		String answers[] = { "A", "A" };

		EvaluationStratergy evaluationStratergy1 = new ObjectiveEvaluation();
		EvaluationStratergy evaluationStratergy2 = new DescriptiveEvaluation();

		try {
			int score1 = exam.submitExam(student, answers, 10, evaluationStratergy1);
			System.out.println("Score 1: " + score1);
			int score2 = exam.submitExam(student, answers, 8, evaluationStratergy2);
			System.out.println("Score 2: " + score2);
			int score3 = exam.submitExam(student, answers, 15, evaluationStratergy2);
			System.out.println("Score 3: " + score3);
		} catch (ExamTimeExpiredException e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

}
