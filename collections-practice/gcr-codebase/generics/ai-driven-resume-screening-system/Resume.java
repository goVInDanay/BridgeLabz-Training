package collections.gcr_codebase.generics.ai_driven_resume_screening_system;

class Resume<T extends JobRole> {
	private int candidateExperience;
	private T jobRole;

	Resume(T jobRole, int candidateExperience) {
		this.candidateExperience = candidateExperience;
		this.jobRole = jobRole;
	}
	
	public boolean isEligible() {
		return candidateExperience >= jobRole.getExperience();
	}
	
	public T getRole() {
		return jobRole;
	}
}
