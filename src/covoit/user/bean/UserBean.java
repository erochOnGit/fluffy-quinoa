package covoit.user.bean;

public class UserBean {

	private String name;
	private String lastName;
	private String email;
	private String tel;
	private String pwd;
	
	//constructor
	public UserBean(String name, String lastName, String email, String tel, String pwd) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.tel = tel;
		this.pwd = pwd;
	}
	
	//getters/setters
	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}
	
	public String getEmail() {return email;}
	
	public void setEmail(String email) {this.email = email;}
	
	public String getPwd() {return pwd;}
	
	public void setPwd(String pwd) {this.pwd = pwd;}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	//functions
	public void modifyPwd() {
		
	}
	public void modifyTel() {
		
	}
}
