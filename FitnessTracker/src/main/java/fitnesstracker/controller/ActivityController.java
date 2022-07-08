package fitnesstracker.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fitnesstracker.advices.ActivityNotFoundException;
import fitnesstracker.dto.ActivityDto;
import fitnesstracker.entity.Activity;
import fitnesstracker.service.IActivityService;


@RestController
@RequestMapping("activity")
public class ActivityController {
	Log logger=LogFactory.getLog(ActivityController.class);
	@Autowired
	IActivityService activityservice;

	@GetMapping(path = "getactivities")
	public List<ActivityDto> getActivities() throws ActivityNotFoundException {
		List<ActivityDto> lc = activityservice.getActivities();
		return lc;
	}

	@PostMapping("addactivity")
	public ActivityDto addActivity(@RequestBody ActivityDto activity) throws Throwable {
		 activityservice.addActivity(activity);
		return activity;
	}

	@PutMapping("updateactivity")
	public ActivityDto updateActivity(@RequestBody ActivityDto activity) throws Throwable {
		activityservice.updateActivity(activity);
		return activity;
	}

	@DeleteMapping("deleteactivity")
	public String deleteActivity(@RequestBody ActivityDto activity)  {
		activityservice.deleteActivity(activity);
		return "String";
	}

	@GetMapping("getactivitybyname/{activityName}")
	public Activity getActivityByActivityName(@PathVariable String activityName) throws Throwable {
		Activity activity= activityservice.getActivityByActivityName(activityName);
		return activity;
	}

	@GetMapping("getactivitybyduration/{durationInMinutes}")
	public Activity getActivityBydurationinminutesSorted(@PathVariable int durationInMinutes) throws Throwable {
		Activity activity = activityservice.getActivityBydurationInMinutes(durationInMinutes);
		return activity;
	}
}

