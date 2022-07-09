
  package fitnesstracker.repository;
  
  
  import org.springframework.data.jpa.repository.JpaRepository; 
  import org.springframework.data.jpa.repository.Query; 
  import org.springframework.stereotype.Repository;
  
  import fitnesstracker.entity.AppUser;
  
  
  public interface AppUserRepository extends JpaRepository<AppUser,Integer> 
  {
  
  @Query("Select user from AppUser user where userId=?1")
  public AppUser getByUserId(int userId);
  
  @Query("Select user from AppUser user where email=?1") 
  public AppUser findByUserEmail(String email);
  }
  
  
 