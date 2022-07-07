package fitnesstracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fitnesstracker.entity.Activity;
import fitnesstracker.repository.ActivityRepository;

    @Service
    public class ActivityService {

	@Autowired
	ActivityRepository activityrepo;

	public List<Activity> getActivities() {
		List<Activity> lc = activityrepo.findAll();
		return lc;
	}

	public Activity addActivity(Activity a) {
		Activity act1 = activityrepo.save(a);

		return act1;

	}

	public Activity updateActivity(Activity a) {

		Activity act2 = activityrepo.save(a);

		return act2;

	}

	public String deleteActivity(Activity a) {
		activityrepo.delete(a);

		return "string";

	}

	public Activity getActivityByActivityName(String activityName) {
		Activity act3 = activityrepo.findByactivityName(activityName);
		return act3;
	}

	public Activity getActivityBydurationInMinutes(int durationinminutes) {
		Activity act4 = activityrepo.getActivityBydurationInMinutes(durationinminutes);
		return act4;
	}

}
