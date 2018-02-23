package covoit.trajets.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import covoit.beans.TrajetBean;

/**
 * Servlet implementation class TrajetsSrv
 */
@WebServlet("/TrajetsSrv")
public class TrajetsSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String VIEW_PAGES_URL="/WEB-INF/trip/trip.jsp";
	
	public static final String PASSENGERS_PARAM = "passengers";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrajetsSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String showPassengers = request.getParameter(PASSENGERS_PARAM);
		
		HttpSession session = request.getSession();
		TrajetBean trajet = (TrajetBean)session.getAttribute("trajet");
		
		if(showPassengers != null && trajet != null) {
			Gson gson = new Gson();
			String respJSON = gson.toJson(trajet.retrievePassengers());
			response.setContentType("application/json");
	        response.setCharacterEncoding("UTF-8");
	        response.getWriter().write(respJSON);
		}
		
		this.getServletContext().getRequestDispatcher(VIEW_PAGES_URL).include( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
