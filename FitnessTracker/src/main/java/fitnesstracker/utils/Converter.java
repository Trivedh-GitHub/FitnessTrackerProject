package fitnesstracker.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import fitnesstracker.dto.AppUserDto;
import fitnesstracker.entity.AppUser;

public class Converter {
	public static AppUserDto convertToDto(AppUser user) {
		
		AppUserDto appUserDto =new AppUserDto();
		
		BeanUtils.copyProperties(user,appUserDto);
		return appUserDto;
	}
	public static List<AppUserDto> convertToDto(List<AppUser> list)
    {
        List<AppUserDto> listDto =new ArrayList<>();
        for(AppUser app:list)
        {
            listDto.add(convertToDto(app));

        }
        return listDto;
    }
	public static AppUser convertToEntity(AppUserDto appDto)
    {
        AppUser appuser=new AppUser();
        BeanUtils.copyProperties(appDto, appuser);
        return appuser;
    }
    public static List<AppUser> convertToEntity(List<AppUserDto> listDto)
    {
 
        List<AppUser> list =new ArrayList<>();
        for(AppUserDto adminDto:listDto)
        {
            list.add(convertToEntity(adminDto));

        }
        return list;

    }
	
}
 


