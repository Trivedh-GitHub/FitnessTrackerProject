package fitnesstracker.service;

import java.util.List;

import fitnesstracker.dto.AppUserDto;
import fitnesstracker.entity.AppUser;

public interface IAppUserService {

	public List<AppUserDto> getUsers();
	public AppUserDto addUser(AppUserDto a) throws Exception;
	public AppUserDto updateUser(int id,int age) throws Exception;
	
	public String deleteUser(int id) throws Exception;
	public AppUserDto getByUserId(int userId) throws Exception;
	public AppUserDto getUserByemail(String email) throws Exception;
}
