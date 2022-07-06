package fitnesstracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import fitnesstracker.entity.AppAdmin;



@Repository 
public interface AppAdminRepository extends JpaRepository<AppAdmin,Integer> {
      
	  }
	  
	  
	 

