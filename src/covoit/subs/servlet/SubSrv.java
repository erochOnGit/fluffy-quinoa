package covoit.subs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import covoit.connect.ConnectionBDD;
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
		this.getServletContext().getRequestDispatcher(VIEW_PAGES_URL).forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String pwd = request.getParameter("pwd");
	    String pwdConfirm = request.getParameter("pwdConfirm");
	    

	    try {
	    		validateFirstName(firstName);
	    		validateLastName(lastName);
	    		validateTel(tel);
	        validateEmail(email);
	        validatePwd(pwd, pwdConfirm);
	        
	       //this.getServletContext().getRequestDispatcher(VIEW_PAGES_URL).include( request, response );
	        
	        //create user
	        UserBean user = new UserBean(firstName, lastName, email, tel, pwd);
	        
	        //serialisation
	        //Gson gson = new Gson();
	        //String jsonUser = gson.toJson(user);
	        //System.out.println(json);
	        String sql = "INSERT INTO users ('last_name','first_name', 'email', 'password', 'phone')";
	        ConnectionBDD cBdd = new ConnectionBDD();
	        cBdd.connect();
	        cBdd.insert(sql);
	        
	        
	        response.getWriter().println("Utilisateur enregistré avec succès");
	    } catch (Exception e) {
	    	this.getServletContext().getRequestDispatcher(VIEW_PAGES_URL).include( request, response );
	    	response.getWriter().println(e.getMessage());
	    }	        
	}
	
	private void validateFirstName( String name ) throws ServletException{
		if (name.length() == 0) {
			throw new ServletException( "Veuillez saisir votre prenom" );
		}
		
	}
	
	private void validateLastName( String name ) throws ServletException{
		if (name.length() == 0) {
			throw new ServletException( "Veuillez saisir votre nom" );
		}
		
	}
	
	
	private void validateTel( String tel ) throws ServletException{
		if ( tel != null && tel.trim().length() != 0 ) {
			if ( !tel.matches( "[0][1-9][0-9]{8}" ) ) {
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

		if (pwd1.length() < 8) {
			throw new ServletException( "mot de passe inférieur a 8 caractères!" );
		}
		else if(pwd1.length() > 20) {
			throw new ServletException( "mot de passe supérieur a 20 caractères!" );
		}
		
		else if( !(pwd1.equals(pwd2)) ){
			throw new ServletException( "Les mots de passe doivent être identiques" );
		}
	}

	
	}


