package fitnesstracker.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fitnesstracker.advices.UserNotFoundException;
import fitnesstracker.entity.appUser;
import fitnesstracker.repository.appUserRepository;

	@Service
	public class appUserService {
			@Autowired
			appUserRepository userrepo;
			public List<appUser> getUsers() { 
				  List<appUser> lc=userrepo.findAll();
				  return lc;
			  }
			public String addUser(appUser a)throws Exception
			  { 
				if(a==null)
				{
					throw new UserNotFoundException("user does not exist");
				}
				else {
				  userrepo.save(a);
				  return "post";
				}
			  }
			public String updateUser(appUser a)throws Exception
			  { 
				if(a==null) {
					throw new UserNotFoundException("user does not exist");
				}
				else {
				  userrepo.save(a);
				  return "put";
				}
			  }
			public String deleteUser(appUser a)throws Exception
			  { 
				if (a==null)
				{
					throw new UserNotFoundException("user does not exit");
				}
				else
				{
					 userrepo.delete(a);
					  return "delete";
				} 
			  }
			public appUser getByUserId(int userId)throws Exception
			{ 
				appUser a4=userrepo.getByUserId(userId);
				if(a4==null) {
					throw new UserNotFoundException("user does not exist");
				}
				else {
				return a4;
				}	
			    }
			public appUser getUserByemail(String email)throws Exception 
			{ 
				appUser a5=userrepo.findByUserEmail(email);
				if(a5==null) {
					throw new UserNotFoundException("user does not exist");
				}

				return a5;
			}
			
			
		}


