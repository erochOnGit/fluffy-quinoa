package covoit.subs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import covoit.user.bean.UserBean;

/**
 * Servlet implementation class UserSrv
 */
@WebServlet("/UserSrv")
public class UserSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//TODO: recup infos profils
		//Création de la session
		HttpSession session = request.getSession();
		
		session.setAttribute("name", "john");
		session.setAttribute("lastName", "doe");
		session.setAttribute("mail", "name@live.fr");
		session.setAttribute("tel", "0608234532");
		
		
		UserBean user = new UserBean("john", "doe", "sfqffq@sqf.fr", "0623456777", "dfsdgdgsd");
		Gson gson = new Gson();
		String json = gson.toJson(user);
		response.setContentType("application/json");
        response.getWriter().print(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO: modif tel, mdp
		String tel = request.getParameter("tel");
		String pwd = request.getParameter("pwd");
		String pwdConfirm = request.getParameter("pwdConfirm");
		
		try {
	        validatePwd(pwd, pwdConfirm);	        
	        validateTel(tel);
	        
	      //TODO: persister l utilisateur en base
	        
	        
	        response.getWriter().println("Utilisateur enregistré avec succès");
	    } catch (Exception e) {
	    	this.getServletContext().getRequestDispatcher("").include( request, response );
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
		
		private void validatePwd(String pwd, String pwdConfirm) throws ServletException{

			if( !(pwd.equals(pwdConfirm)) ){
				throw new ServletException( "Les mots de passe doivent être identiques" );
			}
		}
		
		
	}


