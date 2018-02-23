package covoit.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import covoit.beans.AuthBean;
import covoit.beans.UserBean;

public class AuthBeanUnitTest {
	private String email = "test@test.com";
	private String pwd = "123";

	private AuthBean authBean = new AuthBean(email, pwd);
	
	@Test
    public void testEmail() {
        String email = "abc@abc.com";
        authBean.setEmail(email);
        assertTrue(authBean.getEmail() == email);
    }

}
