package fitnesstracker.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Diet{
@Id
@GeneratedValue
@NotNull
		private int id;
			private String breakfast;
			private String dinner;
			private String snack;
			@NotBlank(message = "name is mandatory")
			private String dietname;
			public String getDietname() {
				return dietname;
			}
			public void setDietname(String dietname) {
				this.dietname = dietname;
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
