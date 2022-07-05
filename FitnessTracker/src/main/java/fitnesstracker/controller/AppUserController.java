/*
 * package fitnesstracker.controller; import java.util.List; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import fitnesstracker.advices.UserNotFoundException; import
 * fitnesstracker.entity.AppUser; import fitnesstracker.service.AppUserService;
 * 
 * @RestController
 * 
 * @RequestMapping("user") public class AppUserController {
 * 
 * @Autowired AppUserService userservice;
 * 
 * @GetMapping(path="getuser") public List<AppUser> getuser() {
 * List<AppUser>lc=userservice.getUsers(); return lc; }
 * 
 * @PostMapping("adduser") public String addUser(@RequestBody AppUser a)throws
 * Throwable { userservice.addUser(a); return "post"; }
 * 
 * @PutMapping("updateUser") public String updateUser(@RequestBody AppUser a)
 * throws Throwable { userservice.updateUser(a); return "put";
 * 
 * }
 * 
 * @DeleteMapping("deleteUser") public String deleteUser(@RequestBody AppUser a)
 * throws Throwable { userservice.deleteUser(a); return "deleted"; }
 * 
 * @GetMapping("getuserbyid/{userId}") public AppUser
 * getUserByUserId(@PathVariable int userId) throws Throwable { AppUser
 * a4=userservice.getByUserId(userId); return a4; }
 * 
 * @GetMapping("getuserbyemail/{email}") public AppUser
 * getUserByUseremail(@PathVariable String email)throws Throwable { AppUser a5 =
 * userservice.getUserByemail(email); return a5; }
 * 
 * }
 * 
 * 
 */