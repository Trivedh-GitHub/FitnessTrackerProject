package fitnesstracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fitnesstracker.advices.ReportNotFoundException;
import fitnesstracker.dto.AppUserDto;
import fitnesstracker.entity.Activity;
import fitnesstracker.entity.AppUser;
import fitnesstracker.entity.Diet;
import fitnesstracker.repository.ActivityRepository;
import fitnesstracker.repository.AppUserRepository;
import fitnesstracker.repository.DietRepository;

@Service
public class ReportService {
	@Autowired
    AppUserRepository userrepo;
	@Autowired
	ActivityRepository activityrepo;
	@Autowired
	DietRepository dietrepo;
	
	
	public List<AppUser> getUsers() throws ReportNotFoundException {
	List<AppUser> lc = userrepo.findAll ();
	if (lc.isEmpty()) {
		throw new ReportNotFoundException("Report Not Found ");
	}
	return lc;
	}
	
	public List<Activity> getActivities() throws ReportNotFoundException {
	List<Activity> lc = activityrepo.findAll();
	if (lc.isEmpty()) {
		throw new ReportNotFoundException("Activity Not Found ");
	}
	return lc;
   }

	public List<Diet> getDiets() throws ReportNotFoundException {
	List<Diet> dietList = dietrepo.findAll();
	if (dietList.isEmpty()) {
		throw new ReportNotFoundException("Diet Not Found ");
	}
	return dietList;
	}
}
