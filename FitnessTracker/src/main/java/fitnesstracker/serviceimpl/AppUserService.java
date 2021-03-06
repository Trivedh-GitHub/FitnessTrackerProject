
package fitnesstracker.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fitnesstracker.advices.UserNotFoundException;
import fitnesstracker.dto.AppUserDto;
import fitnesstracker.entity.AppUser;
import fitnesstracker.repository.AppUserRepository;
import fitnesstracker.service.IAppUserService;
import fitnesstracker.utils.Converter;

@Service
public class AppUserService implements IAppUserService {

	@Autowired
	AppUserRepository userrepo;

	public List<AppUserDto> getUsers() {
		List<AppUserDto> lc = Converter.convertToDto(userrepo.findAll() );
		return lc;
	}

	public String addUser(AppUserDto a) throws Exception {
		if (a == null) {
			throw new UserNotFoundException("user does not exist");
		} else {
			userrepo.save(Converter.convertToEntity(a));
			return "post";
		}
	}

	public String updateUser(AppUserDto a) throws Exception {
		if (a == null) {
			throw new UserNotFoundException("user does not exist");
		} else
		{
			AppUser app = Converter.convertToEntity(a);
			int id = a.getUserId();
			AppUser user = userrepo.findById(id).orElseThrow();
			user.setAddress(app.getAddress());
			user.setAge(app.getAge());
			user.setEmail(app.getEmail());
			user.setPhNo(app.getPhNo());
			user.setHeight(app.getHeight());
			user.setWeight(app.getWeight());
			userrepo.save(Converter.convertToEntity(a));
			return "put";
		}
	}

	public String deleteUser(AppUserDto a) throws Exception {
		if (a == null) {
			throw new UserNotFoundException("user does not exit");
		} else {
			userrepo.delete(Converter.convertToEntity(a));
			return "delete";
		}
	}

	public AppUserDto getByUserId(int userId) throws Exception {
		AppUser a4 = userrepo.getByUserId(userId);
		if (a4 == null) {
			throw new UserNotFoundException("user does not exist");
		} else {
			return Converter.convertToDto(a4);
		}
	}

	public AppUserDto getUserByemail(String email) throws Exception {
		AppUser a5 = userrepo.findByUserEmail(email);
		if (a5 == null) {
			throw new UserNotFoundException("user does not exist");
		}
		return Converter.convertToDto(a5);
	}
}
