package fitnesstracker.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import fitnesstracker.dto.ActivityDto;
import fitnesstracker.entity.Activity;


public class Continue {
		public static ActivityDto continueToDto(Activity activity) {
			
			ActivityDto activityDto =new ActivityDto();
			
			BeanUtils.copyProperties(activity,activityDto);
			return activityDto;
		}
		public static List<ActivityDto> continueToDto(List<Activity> list)
	    {
	        List<ActivityDto> listDto =new ArrayList<>();
	        for(Activity app:list)
	        {
	            listDto.add(continueToDto(app));

	        }
	        return listDto;
	    }
		public static Activity continueToEntity(ActivityDto appDto)
	    {
	        Activity activity=new Activity();
	        BeanUtils.copyProperties(appDto, activity);
	        return activity;
	    }
	    public static List<Activity> continueToEntity(List<ActivityDto> listDto)
	    {
	 
	        List<Activity> list =new ArrayList<>();
	        for(ActivityDto activityDto:listDto)
	        {
	            list.add(continueToEntity(activityDto));

	        }
	        return list;

	    }

}
