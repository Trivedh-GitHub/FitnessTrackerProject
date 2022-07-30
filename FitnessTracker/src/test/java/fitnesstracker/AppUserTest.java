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
        a1.setPassword("xyz@123");
        a1.setEmail("abc@gmail.com");
        a1.setAge(23);
        a1.setGender("male");
        a1.setHeight(6);
        a1.setWeight(65);
        a1.setAddress("Hyderanbad");
        a1.setPhNo(895436787);
        
        a2=new AppUserDto();
        a2.setUserId(2);
        a2.setUsername("Trivedh");
        a2.setPassword("xyz@123");
        a2.setEmail("abc@gmail.com");
        a2.setAge(23);
        a2.setGender("male");
        a2.setHeight(6);
        a2.setWeight(65);
        a2.setAddress("Hyderanbad");
        a2.setPhNo(8954367854l);
    }
        @Test
        void testGetAppUser() throws UserNotFoundException {

            
            List<AppUserDto> userList = new ArrayList<>();
            userList.add(a1);
            userList.add(a2);
            List<AppUser> user= Converter.convertToEntity(userList);

            Mockito.when(repo.findAll()).thenReturn(user);

            assertNotNull(appuserservice.getUsers());
        }
		/*
		 * @Test void testUpdateUser() throws Throwable { AppUser appuser =
		 * Converter.convertToEntity(a1); Optional<AppUser> appuser2 =
		 * Optional.of(appuser);
		 * 
		 * Mockito.when(repo.findById(1)).thenReturn(appuser2);
		 * Mockito.when(repo.save(appuser)).thenReturn(appuser);
		 * equals(appuserservice.updateUser());
		 * 
		 * }
		 */
}

