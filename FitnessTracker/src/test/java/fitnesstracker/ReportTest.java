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

import fitnesstracker.advices.ReportNotFoundException;
import fitnesstracker.entity.Report;
import fitnesstracker.repository.ReportRepository;
import fitnesstracker.serviceimpl.ReportService;
@SpringBootTest
class ReportTest {
	@Autowired
    ReportService reportservice;
    
    @MockBean
    ReportRepository repo;
    Report a1=null;
    Report a2=null;

    @BeforeEach
    public void testBeforeEach() {
        a1=new Report();
        a1.setReportId(1);
        a1.setReportName("Internal");
        
        
        a2=new Report();
        a2.setReportId(2);
        a2.setReportName("Internal");
    }
        
        
        @Test
        void testGetReport() throws ReportNotFoundException {
     
            
            List<Report> ReportList = new ArrayList<>();
            ReportList.add(a1);
            ReportList.add(a2);

            Mockito.when(repo.findAll()).thenReturn(ReportList);
     
            assertNotNull(reportservice.getUsers());
        }
        
}
	
