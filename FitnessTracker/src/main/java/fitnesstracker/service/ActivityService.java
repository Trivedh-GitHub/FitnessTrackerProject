package fitnesstracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fitnesstracker.advices.ActivityNotFoundException;
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

	public Activity addActivity(Activity activity) {
		Activity act1 = activityrepo.save(activity);

		return act1;

	}

	public Activity   updateActivity(Activity activity) throws Exception, ActivityNotFoundException  {
		if(activity==null) {
			throw new ActivityNotFoundException("activity does not exist");
		}
		else {
		activityrepo.save(activity);
		return activity;
		}

	}

	public String deleteActivity(Activity activity) {
		activityrepo.delete(activity);

		return "string";

	}

	public Activity getActivityByActivityName(String activityName) throws Exception, ActivityNotFoundException {
		Activity act3 = activityrepo.findByactivityName(activityName);
		if(activityName==null) {
			throw new ActivityNotFoundException("activity does not exist");
		}
		else {
		return act3;
		}
	}

	public Activity getActivityBydurationInMinutes(int durationinminutes) throws Exception {
		Activity act4 = activityrepo.getActivityBydurationInMinutes(durationinminutes);
		return act4;
	}

}
