package fitnesstracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fitnesstracker.entity.Diet;

@Repository
public interface DietRepository extends JpaRepository<Diet, Integer> {


}



