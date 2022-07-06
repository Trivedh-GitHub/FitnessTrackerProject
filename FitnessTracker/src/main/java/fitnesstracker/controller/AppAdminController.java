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


import fitnesstracker.entity.AppUser;
import fitnesstracker.service.AppUserService;

@RestController
@RequestMapping("adminuser")

public class AppAdminController {
	
	
		@Autowired
		AppUserService userservice;

		@GetMapping(path = "getadminuser")
		public List<AppUser> getuser() {
			List<AppUser> lc = userservice.getUsers();
			return lc;
		}

		@PostMapping("addadminuser")
		public String addUser(@RequestBody AppUser a) throws Throwable {
			userservice.addUser(a);
			return "post";
		}

		@PutMapping("updateadminUser")
		public String updateUser(@RequestBody AppUser a) throws Throwable {
			userservice.updateUser(a);
			return "put";

		}

		@DeleteMapping("deleteUser")
		public String deleteUser(@RequestBody AppUser a) throws Throwable {
			userservice.deleteUser(a);
			return "deleted";
		}

		
	}


