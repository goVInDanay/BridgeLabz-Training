package collections.scenario_based.job_portal_resume_shortlisting_system;

import java.util.Set;

public class UserInterface {
	public static void main(String[] args) {
		try {
			ResumeShortlisting portal = new ResumeShortlisting();
			Resume r1 = new Resume("Govind", Set.of("Java", "Spring", "SQL"));
			Resume r2 = new Resume("Nitai", Set.of("Python", "SQL", "AWS"));
			Resume r3 = new Resume("Aman", Set.of("Java", "Docker", "AWS", "Kubernetes"));
			portal.addResume(r1);
			portal.addResume(r2);
			portal.addResume(r3);
			Set<String> requiredSkills = Set.of("Java", "AWS", "SQL");
			System.out.println("Shortlisted Resumes:");
			portal.printShortlisted(requiredSkills);
			Resume r4 = new Resume(null, null);

		} catch (InvalidResumeException e) {
			System.out.println(e.getMessage());
		}
	}

}
