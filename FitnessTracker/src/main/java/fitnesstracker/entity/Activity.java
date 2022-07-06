package fitnesstracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activity {
	@Id
	private int activityNo;
	private String activityName;
	private int durationInMinutes;
	private String frequency;
	
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public int getActivityNo() {
		return activityNo;
	}
	public void setActivityNo(int activityNo) {
		this.activityNo = activityNo;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public int getDurationInMinutes() {
		return durationInMinutes;
	}
	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	@Override
	public String toString() {
		return "Activity [activityNo=" + activityNo + ", activityName=" + activityName + ", durationInMinutes="
				+ durationInMinutes + ", frequency=" + frequency + "]";
	}

}
