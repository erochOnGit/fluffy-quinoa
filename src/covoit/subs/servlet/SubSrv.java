package covoit.subs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import covoit.user.bean.UserBean;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/SubSrv")
public class SubSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String VIEW_PAGES_URL="/WEB-INF/Subscription.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubSrv() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String pwd = request.getParameter("pwd");
	    String pwdConfirm = request.getParameter("pwdConfirm");
	    

	    try {
	        validateEmail(email);
	        validatePwd(pwd, pwdConfirm);
	        validateName(name);
	        validateTel(tel);
	       //this.getServletContext().getRequestDispatcher(VIEW_PAGES_URL).include( request, response );
	        
	        //TODO: créer userbean
	        UserBean user = new UserBean(name, lastName, email, tel, pwd);
	        
	        //TODO: persister l utilisateur en base
	        
	        
	        response.getWriter().println("Utilisateur enregistré avec succès");
	    } catch (Exception e) {
	    	this.getServletContext().getRequestDispatcher(VIEW_PAGES_URL).include( request, response );
	    	response.getWriter().println(e.getMessage());
	    }	        
	}
	
	private void validateTel( String tel ) throws ServletException{
		if ( tel != null && tel.trim().length() != 0 ) {
			if ( !tel.matches( "[0][5-9][[0-9]{8}" ) ) {
				throw new ServletException( "Veuillez saisir un numéro de téléphoe valide" );
			}
		}
		else {
			throw new ServletException( "Un numéro de téléphone est obligatoire" );
		}		
	}

	private void validateEmail( String email ) throws ServletException{
		if ( email != null && email.trim().length() != 0 ) {
			if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
				throw new ServletException( "Veuillez saisir une adresse mail valide" );
			}
		}
		else {
			throw new ServletException( "L'adresse mail est obligatoire" );
		}		
	}
	private void validatePwd(String pwd1, String pwd2) throws ServletException{

		if( !(pwd1.equals(pwd2)) ){
			throw new ServletException( "Les mots de passe doivent être identiques" );
		}
	}
	private void validateName(String name) throws ServletException{}

	
	}


