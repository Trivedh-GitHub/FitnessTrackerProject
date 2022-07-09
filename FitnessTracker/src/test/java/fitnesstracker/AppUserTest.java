package fitnesstracker;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import fitnesstracker.advices.UserNotFoundException;

import fitnesstracker.dto.AppUserDto;

import fitnesstracker.entity.AppUser;

import fitnesstracker.repository.AppUserRepository;

import fitnesstracker.serviceimpl.AppUserService;
import fitnesstracker.utils.Converter;

@SpringBootTest
class AppUserTest {

	@Autowired
	AppUserService appuserservice;
	@Autowired 
	static Converter c;
	
	@MockBean
	AppUserRepository repo;
	
	AppUserDto a1=null;
	AppUserDto a2=null;
	
	@BeforeEach
	public void testBeforeEach() {
	    a1=new AppUserDto();
		a1.setUserId(1);
		a1.setUsername("Trivedh");
		a1.setPassword("xyz123@");
		a1.setEmail("trivedh123@gmail.com");
		a1.setAge(23);
		a1.setGender("Male");
		a1.setHeight(6);
		a1.setWeight(63);
		a1.setAddress("Hyderabad");
		a1.setPhNo(9865435679l);
		
		
		a2=new AppUserDto();
		a2.setUserId(2);
		a2.setUsername("Trivedh");
		a2.setPassword("xyz123@");
		a2.setEmail("trivedh123@gmail.com");
		a2.setAge(23);
		a2.setGender("Male");
		a2.setHeight(6);
		a2.setWeight(63);
		a2.setAddress("Hyderabad");
		a2.setPhNo(9865435679l);		
	}

	@Test
	void testGetAppUsers() throws UserNotFoundException {

		
		List<AppUserDto> appuserList = new ArrayList<>();
		appuserList.add(a1);
		appuserList.add(a2);
		List<AppUser> user= Converter.convertToEntity(appuserList);
		
		Mockito.when(repo.findAll()).thenReturn(user);
		
		assertNotNull(appuserservice.getUsers());
	}
	@Test
    void testUpdateActivity() throws Throwable {
		
        AppUser users = Converter.convertToEntity(a1);
        Optional<AppUser> user2 = Optional.of(users);
        Mockito.when(repo.findById(1)).thenReturn(user2);
        Mockito.when(repo.save(users)).thenReturn(users);
        equals(appuserservice.updateUser(a1));

    }
	
	
	

}
