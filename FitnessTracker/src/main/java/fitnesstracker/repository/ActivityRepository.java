package fitnesstracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fitnesstracker.entity.Activity;

    @Repository
    public interface ActivityRepository extends JpaRepository<Activity, Integer> {

	public Activity findByactivityName(String activityName);

	public Activity getActivityBydurationInMinutes(int durationInMinutes);
}
