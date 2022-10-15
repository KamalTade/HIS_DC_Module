package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;

import in.ashokit.binding.EducationDetails;
import in.ashokit.binding.IncomeDetails;
import in.ashokit.binding.KidsDetails;
import in.ashokit.repository.CitizenDetailsRepo;

public class DCServiceImpl implements DCService {

	@Autowired
	private CitizenDetailsRepo repo;
	
	@Override
	public String search(Integer caseNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveKidDetails(KidsDetails kid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveEducationDetails(EducationDetails edu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveIncomeDetails(IncomeDetails income) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String displaySummaryDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
