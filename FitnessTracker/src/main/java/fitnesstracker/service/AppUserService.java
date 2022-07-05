
package fitnesstracker.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fitnesstracker.advices.UserNotFoundException;
import fitnesstracker.entity.AppUser;
import fitnesstracker.repository.AppUserRepository;

@Service
public class AppUserService {

	@Autowired
	AppUserRepository userrepo;

	public List<AppUser> getUsers() {
		List<AppUser> lc = userrepo.findAll();
		return lc;
	}

	public String addUser(AppUser a) throws Exception {
		if (a == null) {
			throw new UserNotFoundException("user does not exist");
		} else {
			userrepo.save(a);
			return "post";
		}
	}

	public String updateUser(AppUser a) throws Exception {
		if (a == null) {
			throw new UserNotFoundException("user does not exist");
		} else {
			userrepo.save(a);
			return "put";
		}
	}

	public String deleteUser(AppUser a) throws Exception {
		if (a == null) {
			throw new UserNotFoundException("user does not exit");
		} else {
			userrepo.delete(a);
			return "delete";
		}
	}

	public AppUser getByUserId(int userId) throws Exception {
		AppUser a4 = userrepo.getByUserId(userId);
		if (a4 == null) {
			throw new UserNotFoundException("user does not exist");
		} else {
			return a4;
		}
	}

	public AppUser getUserByemail(String email) throws Exception {
		AppUser a5 = userrepo.findByUserEmail(email);
		if (a5 == null) {
			throw new UserNotFoundException("user does not exist");
		}
		return a5;
	}
}
