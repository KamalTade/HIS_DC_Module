package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import in.ashokit.entity.CitizenDetails;
import in.ashokit.repository.CitizenDetailsRepo;

public class AppRunner implements ApplicationRunner {

	@Autowired
	private CitizenDetailsRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		CitizenDetails entity=new CitizenDetails();
		
		
		
	}
	
	

}
