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
	 * Verifier user valide et enregistrer.
	 */
	public boolean isValidUser(String email, String pwd) {
		return false;
	}
	
}
