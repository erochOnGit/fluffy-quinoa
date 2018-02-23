package covoit.subs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import covoit.user.bean.UserBean;

/**
 * Servlet implementation class JsonSrv
 */
@WebServlet("/JsonSrv")
public class JsonSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserBean user;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user = new UserBean("Jonathan", "DERIOT", "jonathanderiot@gmail.com","06765674656", "fkfjgkrejdg");
		
		Gson gson = new Gson();
		String json = gson.toJson(user);
		System.out.println(json);
		response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
		//response.getWriter().append("Served at: sfqsfsf").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
