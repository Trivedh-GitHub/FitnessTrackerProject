
package fitnesstracker.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fitnesstracker.advices.UserNotFoundException;
import fitnesstracker.dto.AppUserDto;
import fitnesstracker.entity.AppUser;
import fitnesstracker.service.IAppUserService;
import fitnesstracker.serviceimpl.AppUserService;
@CrossOrigin(origins = "*")
@RestController

@RequestMapping("/user")
public class AppUserController {

	@Autowired
    AppUserService appuserservice;

 

    @GetMapping(path = "getuser")
    public List<AppUserDto> getUsers() throws UserNotFoundException {
        List<AppUserDto> lc = appuserservice.getUsers();
        return lc;
    }

 

    @PostMapping("/adduser")
    public AppUserDto addAppUser(@RequestBody AppUserDto appuser) throws Throwable {
         return  appuserservice.addUser(appuser);
        
    }

 

    @PutMapping("/updateuser")
    public AppUserDto updateuser(@RequestBody AppUserDto appuser) throws Throwable {
        AppUserDto a1=appuserservice.updateUser(appuser);
        return a1;
    }
    @DeleteMapping("deleteuser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id")int id ) throws Exception
    {
        appuserservice.deleteUser(id);
        
        ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
        return re;
    }

 


    @GetMapping("getuserbyemail/{email}")
    public AppUserDto getUseryByEmail(@PathVariable String userEmail) throws Throwable {
        AppUserDto appuser= appuserservice.getUserByemail(userEmail);
        return appuser;
    }

 

    @GetMapping("getuserbyid/{userId}")
	public AppUserDto getUserByUserId(@PathVariable int userId) throws Throwable {
		AppUserDto a4 = appuserservice.getByUserId(userId);
		return a4;
	}
 }