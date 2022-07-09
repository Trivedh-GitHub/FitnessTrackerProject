package fitnesstracker;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import fitnesstracker.advices.ActivityNotFoundException;
import fitnesstracker.dto.ActivityDto;
import fitnesstracker.entity.Activity;
import fitnesstracker.repository.ActivityRepository;
import fitnesstracker.serviceimpl.ActivityService;
import fitnesstracker.utils.Continue;
@SpringBootTest
class ActivityTest {

	@Autowired
	ActivityService activityservice;
	@Autowired 
	static Continue c;
	
	@MockBean
	ActivityRepository repo;
	ActivityDto a1=null;
	ActivityDto a2=null;
	
	@BeforeEach
	public void testBeforeEach() {
	    a1=new ActivityDto();
		a1.setActivityNo(1);
		a1.setActivityName("swimming");
		a1.setDurationInMinutes(25);
		a1.setFrequency("two days in a week");
		
		a2=new ActivityDto();
		a2.setActivityNo(2);
		a2.setActivityName("running");
		a2.setDurationInMinutes(35);
		a2.setFrequency("three days in a week");
		
	}

	@Test
	void testGetActivities() throws ActivityNotFoundException {

		
		List<ActivityDto> activityList = new ArrayList<>();
		activityList.add(a1);
		activityList.add(a2);
		List<Activity> activity= Continue.continueToEntity(activityList);
		
		Mockito.when(repo.findAll()).thenReturn(activity);
		
		assertNotNull(activityservice.getActivities());
	}
	
	@Test
    void testUpdateActivity() throws Throwable {

 

        Activity activity = Continue.continueToEntity(a1);
        Optional<Activity> activity2 = Optional.of(activity);
      
        Mockito.when(repo.findById(1)).thenReturn(activity2);
        Mockito.when(repo.save(activity)).thenReturn(activity);
        equals(activityservice.updateActivity(a1));

    }
	
	
	
}
