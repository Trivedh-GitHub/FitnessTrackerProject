package fitnesstracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fitnesstracker.entity.Activity;
import fitnesstracker.service.ActivityService;

@RestController
@RequestMapping("activity")
public class ActivityController {
	@Autowired
	ActivityService activityservice;

	@GetMapping(path = "getactivities")
	public List<Activity> getActivities() {
		List<Activity> lc = activityservice.getActivities();
		return lc;
	}

	@PostMapping("addactivity")
	public Activity addActivity(@RequestBody Activity a) {
		Activity act1 = activityservice.addActivity(a);
		return act1;
	}

	@PutMapping("updateactivity")
	public Activity updateActivity(@RequestBody Activity a) {
		Activity act2 = activityservice.updateActivity(a);
		return act2;
	}

	@DeleteMapping("deleteactivity")
	public String deleteActivity(@RequestBody Activity a) {
		activityservice.deleteActivity(a);
		return "String";
	}

	@GetMapping("getactivitybyname/{activityName}")
	public Activity getActivityByActivityName(@PathVariable String activityName) {
		Activity act4 = activityservice.getActivityByActivityName(activityName);
		return act4;
	}

	@GetMapping("getactivitybyduration/{durationInMinutes}")
	public Activity getActivityBydurationinminutesSorted(@PathVariable int durationInMinutes) {
		Activity act5 = activityservice.getActivityBydurationInMinutes(durationInMinutes);
		return act5;
	}
}

