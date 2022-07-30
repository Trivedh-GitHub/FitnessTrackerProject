
package fitnesstracker.serviceimpl;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.BeanUtils;
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
@Override
	public List<AppUserDto> getUsers() {
		List<AppUserDto> lc = Converter.convertToDto(userrepo.findAll() );
		return lc;
	}
@Override
	public AppUserDto addUser(AppUserDto a) throws Exception {
		if (a == null) {
			throw new UserNotFoundException("user does not exist");
		} else {
			AppUser appuser=new AppUser();
			BeanUtils.copyProperties(a, appuser);
			userrepo.save(appuser);
			return a;
		}
	}
@Override
	public AppUserDto updateUser( int id,int age) throws Exception {
		if (!userrepo.existsById(id)) {
			throw new UserNotFoundException("user does not exist");
		} else
		{
			//AppUser app = Converter.convertToEntity();
			AppUser user = userrepo.findById(id).orElseThrow();
			user.setAge(age);
			AppUserDto appUserDto = new AppUserDto();
			userrepo.save(Converter.convertToEntity(appUserDto));
			return appUserDto;
		}
	}
public AppUserDto updateUser(AppUserDto userrepo1 ) throws Exception {
	AppUser appuser = Converter.convertToEntity(userrepo1);
    int id = appuser.getUserId();
    Supplier<Exception> s1=()->new Exception("user not found");
       AppUser userupdated=userrepo.findById(id).orElseThrow(s1);
       userupdated.setUserId(appuser.getUserId());
       userupdated.setUsername(appuser.getUsername());
       userupdated.setPassword(appuser.getPassword());
       userupdated.setEmail(appuser.getEmail());
       userupdated.setAge(appuser.getAge());
       userupdated.setHeight(appuser.getHeight());
       userupdated.setWeight(appuser.getWeight());
       userupdated.setAddress(appuser.getAddress());
       userupdated.setPhNo(appuser.getPhNo());
       
       
       return Converter.convertToDto(userupdated);
       }

	
@Override
	public AppUserDto getByUserId(int userId) throws Exception {
		AppUser a4 = userrepo.getByUserId(userId);
		if (a4 == null) {
			throw new UserNotFoundException("user does not exist");
		} else {
			return Converter.convertToDto(a4);
		}
	}
@Override
	public AppUserDto getUserByemail(String email) throws Exception {
		AppUser a5 = userrepo.findByUserEmail(email);
		if (a5 == null) {
			throw new UserNotFoundException("user does not exist");
		}
		return Converter.convertToDto(a5);
	}
@Override
	public String deleteUser(int id) throws Exception {
		// TODO Auto-generated method stub
		userrepo.deleteById(id);
		return "delete";
	}



	
}
