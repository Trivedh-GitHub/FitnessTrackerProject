package fitnesstracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fitnesstracker.advices.ActivityNotFoundException;
import fitnesstracker.dto.ActivityDto;
import fitnesstracker.dto.AppUserDto;
import fitnesstracker.entity.Activity;
import fitnesstracker.entity.AppUser;
import fitnesstracker.entity.Diet;
import fitnesstracker.service.ActivityService;
import fitnesstracker.service.AppAdminService;
import fitnesstracker.service.AppUserService;
import fitnesstracker.service.DietService;

@RestController
@RequestMapping("report")
public class ReportController {
	@Autowired
	AppUserService appuserservice;
	@Autowired
	ActivityService activityservice;
	@Autowired
	DietService dietservice;
	
	@GetMapping(path = "getuser")
    public List<AppUserDto> getuser() {
        List<AppUserDto> lc = appuserservice.getUsers();
        return lc;
    }
	
	@GetMapping(path = "getactivities")
    public List<ActivityDto> getActivities() throws ActivityNotFoundException {
        List<ActivityDto> lc = activityservice.getActivities();
        return lc;
    }
	  
	  @GetMapping(path = "getdiets")
	    public List<Diet> getDiets() {
	        List<Diet> dietList = dietservice.getDiets();
	        return dietList;
	    }
	

}
