package fitnesstracker.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fitnesstracker.advices.ActivityNotFoundException;
import fitnesstracker.dto.ActivityDto;
import fitnesstracker.entity.Activity;
import fitnesstracker.entity.AppUser;
import fitnesstracker.repository.ActivityRepository;
import fitnesstracker.service.IActivityService;
import fitnesstracker.utils.Continue;
import fitnesstracker.utils.Converter;

    @Service
    public class ActivityService implements IActivityService {

	@Autowired
	ActivityRepository activityrepo;
	public List<ActivityDto> getActivities() throws ActivityNotFoundException {
		List<ActivityDto> lc =Continue.continueToDto(activityrepo.findAll());
		if(lc.isEmpty()) {
			throw new ActivityNotFoundException("activity does not exist");
		}
		else {
		return lc;
		}
	}
	public ActivityDto addActivity(ActivityDto activity) throws Exception, ActivityNotFoundException {
		if( activity==null) {
			throw new ActivityNotFoundException("activity does not exit");
		}
		else {
		activityrepo.save(Continue.continueToEntity(activity));

		return activity;
		}

	}
	public ActivityDto   updateActivity(ActivityDto activity) throws Exception, ActivityNotFoundException  {
		if(activity==null) {
			throw new ActivityNotFoundException("activity does not exist");
		}
		else {
			Activity ct = Continue.continueToEntity(activity);
			int no = ct.getActivityNo();
			Activity use = activityrepo.findById(no).orElseThrow();
			use.setActivityNo(ct.getActivityNo());
			use.setActivityName(ct.getActivityName());
			use.setDurationInMinutes(ct.getDurationInMinutes());
			use.setFrequency(ct.getFrequency());
			activityrepo.save(Continue.continueToEntity(activity));
			
			return activity;
		}

	}
	public String deleteActivity(ActivityDto activity) {
		activityrepo.deleteAll();

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
