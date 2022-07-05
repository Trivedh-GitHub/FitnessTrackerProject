package fitnesstracker.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.stereotype.Repository;

import fitnesstracker.entity.appUser;

		@Repository
		public interface appUserRepository extends JpaRepository<appUser, Integer> {

			@Query("Select user from appUser user where userId=?1")
			public appUser getByUserId(int userId);
			@Query("Select user from appUser user where email=?1")
			public appUser findByUserEmail(String email);
			

		}


