package fitnesstracker.service;

import java.util.List;

import fitnesstracker.entity.Activity;
import fitnesstracker.entity.AppUser;
import fitnesstracker.entity.Diet;

public interface IReportService {
	public List<AppUser> getUsers();
	public List<Activity> getActivities();
	public List<Diet> getDiets();

}
