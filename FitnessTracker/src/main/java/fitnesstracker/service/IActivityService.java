package fitnesstracker.service;

import java.util.List;

import fitnesstracker.advices.ActivityNotFoundException;
import fitnesstracker.dto.ActivityDto;
import fitnesstracker.entity.Activity;

public interface IActivityService  {
	public List<ActivityDto> getActivities() throws ActivityNotFoundException;
	public ActivityDto addActivity(ActivityDto activity) throws Exception, ActivityNotFoundException;
	public ActivityDto   updateActivity(ActivityDto activity) throws Exception, ActivityNotFoundException;
	public String deleteActivity(ActivityDto activity);
	public Activity getActivityByActivityName(String activityName) throws Exception, ActivityNotFoundException;
	public Activity getActivityBydurationInMinutes(int durationinminutes) throws Exception ;
}
