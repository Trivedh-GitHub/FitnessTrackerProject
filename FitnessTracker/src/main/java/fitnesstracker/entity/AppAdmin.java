package fitnesstracker.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class AppAdmin {
	@Id
	@NotNull
	private int Adminid;
	public int getAdminid() {
		return Adminid;
	}
	public void setAdminid(int adminid) {
		Adminid = adminid;
	}
	@NotBlank(message = "name is mandatory")
	private String name;
	private String password;
    @NotBlank(message = "Email is mandatory")
    @Email
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