package covoit.subs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import covoit.user.bean.User;

/**
 * Servlet implementation class JsonSrv
 */
@WebServlet("/JsonSrv")
public class JsonSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private User user;
       
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
		System.out.println("debut");
		user = new User("deriot","jonathanderiot@gmail.com","fergregze");
		
		Gson gson = new Gson();
		String json = gson.toJson(user);
		System.out.println(json);
		//response.getWriter().append("Served at: sfqsfsf").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
