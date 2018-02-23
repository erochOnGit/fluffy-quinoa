package covoit.beans;

public class AuthBean {
	private String email;
	private String pwd;
	
	public AuthBean(String email, String pwd) {
		super();
		this.email = email;
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	/**
	 * Verifier user valide et en base selon email et mot de passe.
	 */
	public boolean isValidUser() {
		return false;
	}
	
	/**
	 * Charger user selon auth.
	 */
	public UserBean retrieveUser() {
		return null;
	}
	
}
