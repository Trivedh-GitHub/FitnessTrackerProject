package fitnesstracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	
	public List<AppUser> getUsers() {
	List<AppUser> lc = userrepo.findAll();
	return lc;
	}
	
	public List<Activity> getActivities() {
	List<Activity> lc = activityrepo.findAll();
	return lc;
   }

	public List<Diet> getDiets() {
	List<Diet> dietList = dietrepo.findAll();
	return dietList;
	}
}
