package collections.gcr_codebase.generics.ai_driven_resume_screening_system;
import java.util.*;

public class AIDrivenResumeScreeningSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resume<SoftwareEngineer> seResume = new Resume<SoftwareEngineer>(new SoftwareEngineer(), 3);

		Resume<DataScientist> dsResume = new Resume<DataScientist>(new DataScientist(), 2);

		Resume<ProductManager> pmResume = new Resume<ProductManager>(new ProductManager(), 4);

		ResumeScreening.screenResume(seResume);
		ResumeScreening.screenResume(dsResume);
		ResumeScreening.screenResume(pmResume);
		
		List<JobRole> roles = new ArrayList<JobRole>();
		
		roles.add(new SoftwareEngineer());
		roles.add(new DataScientist());
		roles.add(new ProductManager());
		
		ResumeScreening.screenAllResume(roles);
	}

}
