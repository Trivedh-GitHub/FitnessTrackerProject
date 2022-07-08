package fitnesstracker.service;

import java.util.List;

import fitnesstracker.entity.AppUser;

public interface IAppAdminService {

	public List<AppUser> getUsers();
	public String addUser(AppUser a) throws Exception;
	public String updateUser(AppUser a) throws Exception;
	public String deleteUser(AppUser a) throws Exception;

}
