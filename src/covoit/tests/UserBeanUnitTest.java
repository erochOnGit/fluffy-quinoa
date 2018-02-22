package covoit.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import covoit.beans.UserBean;

public class UserBeanUnitTest {

	private String firstname = "john";
	private String lastname = "smith";
	private String pwd = "123";
	private String email = "johnsmith@email.com";
	private String tel = "0506070809";
	private UserBean userBean = new UserBean(firstname, lastname, email, tel, pwd);
	
	@Test
    public void testFirstName() {
        String firstName = "tom";
        userBean.setFirstname(firstName);
        assertTrue(userBean.getFirstname() == firstName);
    }
	
	
	@Test
    public void testLastName() {
		String lastName = "jedusor";
        userBean.setLastname(lastName);
        assertTrue(userBean.getLastname() == lastName);
    }
	
	@Test
    public void testPassword() {
        String password = "456";
        userBean.setPwd(password);
        assertTrue(userBean.getPwd() == password);
    }
	
	@Test
    public void testEmail() {
        String Email = "tom@gmail.com";
        userBean.setEmail(Email);
        assertTrue(userBean.getEmail() == Email);
    }
	
	@Test
    public void testTel() {
        String phone = "789456123";
        userBean.setFirstname(phone);
        assertTrue(userBean.getFirstname() == phone);
    }
}
