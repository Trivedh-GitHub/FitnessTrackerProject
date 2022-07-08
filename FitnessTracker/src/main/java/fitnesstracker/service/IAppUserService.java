package fitnesstracker.service;

import java.util.List;

import fitnesstracker.dto.AppUserDto;

public interface IAppUserService {

	public List<AppUserDto> getUsers();
	public String addUser(AppUserDto a) throws Exception;
	public String updateUser(AppUserDto a) throws Exception;
	public String deleteUser(AppUserDto a) throws Exception;
	public AppUserDto getByUserId(int userId) throws Exception;
	public AppUserDto getUserByemail(String email) throws Exception;
}
