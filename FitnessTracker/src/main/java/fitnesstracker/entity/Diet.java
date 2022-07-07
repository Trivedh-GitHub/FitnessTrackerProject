package fitnesstracker.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Diet{
	
	@Id
	@GeneratedValue
	private int id;
	private String breakfast;
	private String dinner;
	private String snack;
	private String dietname;
	public String getDietname() {
		return dietname;
	}
	public void setDietname(String dietname) {
		this.dietname = dietname;
	}
	public Diet() {
		super();
// TODO Auto-generated constructor stub
	}
	public Diet(int id, String breakfast, String dinner, String snack, String day) {
		super();
		this.id = id;
		this.breakfast = breakfast;
		this.dinner = dinner;
		this.snack = snack;
		this.day = day;
	}
	private String day;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}
	public String getSnack() {
		return snack;
	}
	public void setSnack(String snack) {
		this.snack = snack;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "Diet [id=" + id + ", breakfast=" + breakfast + ", dinner=" + dinner + ", snack=" + snack + ", dietname="
				+ dietname + ", day=" + day + "]";
	}
	
	
	}

	
 
	
	