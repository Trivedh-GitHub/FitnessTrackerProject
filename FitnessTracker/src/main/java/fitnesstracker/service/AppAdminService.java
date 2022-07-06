package fitnesstracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fitnesstracker.advices.AdminNotFoundException;
import fitnesstracker.entity.AppUser;
import fitnesstracker.repository.AppUserRepository;

@Service
public class AppAdminService {
	    @Autowired
		AppUserRepository userrepo;

		public List<AppUser> getUsers() {
			List<AppUser> lc = userrepo.findAll();
			return lc;
		}

		public String addUser(AppUser a) throws Exception {
			if (a == null) {
				throw new AdminNotFoundException("admin does not exist");
			} else {
				userrepo.save(a);
				return "post";
			}
		}

		public String updateUser(AppUser a) throws Exception {
			if (a == null) {
				throw new AdminNotFoundException("admin does not exist");
			} else {
				userrepo.save(a);
				return "put";
			}
		}

		public String deleteUser(AppUser a) throws Exception {
			if (a == null) {
				throw new AdminNotFoundException("admin does not exit");
			} else {
				userrepo.delete(a);
				return "delete";
			}
		}
}
