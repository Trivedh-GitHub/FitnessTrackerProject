package fitnesstracker.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
/* @Table(name="appuser") */
public class AppUser{
	@Id
	@GeneratedValue
	
	private int userId;
	private String username;
	private String password;
	private String email;
	private int age;
	private String gender;
	private int height;
	private int weight;
	private String address;
	private long phNo;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "AppUser [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + ", height=" + height + ", weight=" + weight + ", address="
				+ address + ", phNo=" + phNo + "]";
	}
	
	}
	
