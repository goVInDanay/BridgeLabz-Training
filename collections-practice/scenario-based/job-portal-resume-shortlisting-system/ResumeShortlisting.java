package collections.scenario_based.job_portal_resume_shortlisting_system;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

class ResumeShortlisting {
	private List<Resume> resumes;

	public ResumeShortlisting() {
		this.resumes = new ArrayList<Resume>();
	}

	public void addResume(Resume resume) {
		resumes.add(resume);
	}

	public List<Resume> shortlist(Set<String> requiredSkills) {
		Comparator<Resume> skillComparator = (r1, r2) -> {
			long match1 = r1.getSkills().stream().filter(requiredSkills::contains).count();
			long match2 = r2.getSkills().stream().filter(requiredSkills::contains).count();
			return Long.compare(match1, match2);
		};

		List<Resume> shortlisted = new ArrayList<Resume>(resumes);
		shortlisted.sort(skillComparator);
		return shortlisted;
	}

	public void printShortlisted(Set<String> requiredSkills) {
		List<Resume> shortlisted = shortlist(requiredSkills);
		for (Resume resume : resumes) {
			long match = resume.getSkills().stream().filter(requiredSkills::contains).count();
			System.out.println(match + " | Matching skills: " + match);
		}
	}
}
