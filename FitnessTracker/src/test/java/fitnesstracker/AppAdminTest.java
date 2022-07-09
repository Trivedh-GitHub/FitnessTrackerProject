package fitnesstracker;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import fitnesstracker.advices.AdminNotFoundException;
import fitnesstracker.entity.AppAdmin;
import fitnesstracker.repository.AppAdminRepository;
import fitnesstracker.serviceimpl.AppAdminService;
@SpringBootTest
class AppAdminTest {

	
	@Autowired
    AppAdminService appadminservice;
   
   

    @MockBean
    AppAdminRepository repo;
    AppAdmin a1=null;
    AppAdmin a2=null;

    @BeforeEach
    public void testBeforeEach() {
        a1=new AppAdmin();
        a1.setAdminid(1);
        a1.setName("magana");
        a1.setEmail("abc@123");
        a1.setPassword("naveen");
        a1.setPhonenumber(9129826484l);

        a2=new AppAdmin();
        a2.setAdminid(2);
        a2.setName("magana");
        a2.setEmail("abc@123");
        a2.setPassword("naveen");
        a2.setPhonenumber(9129826484l);
    }
    @Test
    void testGetUser() throws AdminNotFoundException {

        
        List<AppAdmin> AdminList = new ArrayList<>();
        AdminList.add(a1);
        AdminList.add(a2);
     
        Mockito.when(repo.findAll()).thenReturn(AdminList);

        assertNotNull(appadminservice.getUsers());
    }
   
}
	
