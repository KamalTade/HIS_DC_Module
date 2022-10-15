package in.ashokit.service;

import in.ashokit.binding.EducationDetails;
import in.ashokit.binding.IncomeDetails;
import in.ashokit.binding.KidsDetails;

public interface DCService {

	
	public String search(Integer caseNum);
	
	public boolean saveKidDetails(KidsDetails kid);
	
	public boolean saveEducationDetails(EducationDetails edu);
	
	public boolean saveIncomeDetails(IncomeDetails income);
	
	public String displaySummaryDetails();
	
}
