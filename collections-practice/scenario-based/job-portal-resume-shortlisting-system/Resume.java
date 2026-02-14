package collections.scenario_based.job_portal_resume_shortlisting_system;

import java.util.Set;

class Resume {
	private String name;
	private Set<String> skills;

	Resume(String name, Set<String> skills) throws InvalidResumeException {
		if (name == null || name.isEmpty()) {
			throw new InvalidResumeException("Resume must have a valid name");
		}
		if (skills == null || skills.isEmpty()) {
			throw new InvalidResumeException("Resume must have atleast one skill");
		}
		this.name = name;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public Set<String> getSkills() {
		return skills;
	}

	@Override
	public String toString() {
		return name + " | Skills: " + skills;
	}
}
