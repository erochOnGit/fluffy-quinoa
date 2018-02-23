package covoit.auth.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import covoit.beans.AuthBean;
import covoit.beans.UserBean;

/**
 * Servlet implementation class AuthSrv
 */
@WebServlet(name="/AuthSrv", urlPatterns="/formAuth")
public class AuthSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static final String LOGOUT_PARAM = "logout";
	
	public static final String EMAIL_PARAM = "email";
	public static final String PWD_PARAM = "passwd";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// if logout param then log off and close/clean user session.
		String logout = request.getParameter(LOGOUT_PARAM);
		if(logout != null) {
			HttpSession session = request.getSession();
			session.invalidate();
		}
		
		// grab auth form view.
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// submit authentification.
		String email = request.getParameter(EMAIL_PARAM);
		String pwd = request.getParameter(PWD_PARAM);
		
		//TODO: add email et pwd check.
		
		// verify if email/pwd pair in db for any user.
		AuthBean auth = new AuthBean(email, pwd);
		if( auth.isValidUser() ) {
			//logon
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(15);
			
			//TOTO: get user from DB.
			UserBean user = auth.retrieveUser();
			session.setAttribute("user", user);
			
			//Retourner data user en json to front.
			
		} else {
			// error logon failure.
		}
		
	}

}
