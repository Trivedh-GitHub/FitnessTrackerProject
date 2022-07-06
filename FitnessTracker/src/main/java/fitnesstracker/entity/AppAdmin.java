package fitnesstracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AppAdmin {
	@Id
	private int Adminid;

	private String name;
	private String password;
	private String email;
	private long phonenumber;
	/*
	 * @OneToOne(cascade=CascadeType.ALL,mappedBy="appuser")
	 * 
	 * @JoinColumn
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "appAdmin [name=" + name + ", password=" + password + ", email=" + email + ", phonenumber=" + phonenumber
				+ "]";
	}

}
