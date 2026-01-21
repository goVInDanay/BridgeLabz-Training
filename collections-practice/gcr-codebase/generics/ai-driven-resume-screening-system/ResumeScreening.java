package collections.gcr_codebase.generics.ai_driven_resume_screening_system;

import java.util.List;

class ResumeScreening {
	public static <T extends JobRole> void screenResume(Resume<T> resume) {
		if (resume.isEligible()) {
			System.out.println("Eligible for role: " + resume.getRole().getRole());
		} else {
			System.out.println("Not eligible for role: " + resume.getRole().getRole());
		}
	}
	
	public static void screenAllResume(List<? extends JobRole> roles) {
		for(JobRole role : roles) {
			System.out.println("Screening for: " + role.getRole());
		}
	}
}
