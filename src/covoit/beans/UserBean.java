package covoit.beans;

import java.io.Serializable;

public class UserBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String firstname;
	private String lastname;
	private String pwd;
	private String email;
	private String tel;
	
	public UserBean(String fname, String lname, String email, String tel, String pwd) {
		this.lastname = lname;
		this.firstname = fname;
		this.email = email;
		this.tel = tel;
		this.pwd = pwd;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String fname) {
		this.firstname = fname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "UserBean [firstname=" + firstname + ", pwd=" + pwd + ", email=" + email + "]";
	}
	
}
