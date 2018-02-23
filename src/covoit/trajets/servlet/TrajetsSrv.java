package covoit.trajets.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import covoit.beans.*;

/**
 * Servlet implementation class TrajetsSrv
 */
@WebServlet("/TrajetsSrv")
public class TrajetsSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String VIEW_PAGES_URL="/WEB-INF/trip/trip.jsp";

	public static final String PASSENGERS_PARAM = "passengers";
	public static String TRAJETS_PARAM = null;
       
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
		String showTrajets = request.getParameter(TRAJETS_PARAM);
		
		HttpSession session = request.getSession();
		
		TrajetBean trajet = (TrajetBean)session.getAttribute("trajet");
		
		if(showTrajets != null && trajet != null) {
			Gson gson = new Gson();
			String respJSON = gson.toJson(trajet);
			response.setContentType("application/json");
	        response.setCharacterEncoding("UTF-8");
	        response.getWriter().write(respJSON);
		}
		
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
		LocationBean departure = new LocationBean(request.getParameter("departure"), 1.58, 2.78);
		LocationBean arrival =  new LocationBean(request.getParameter("arrival"), 9.84, 0.63);
		UserBean driver = new UserBean("john", "smith", "john.smith@email.com", "0506070809", "abc123");
		UserBean passenger1 = new UserBean("rick", "sanchez", "rick.sanchez@email.com", "0506070809", "abc123");
		UserBean passenger2 = new UserBean("morty", "smith", "morty.smith@email.com", "0506070809", "abc123");
		Set<UserBean> passengers = new HashSet<>();
		Date dep_date = new Date();
		Date arr_date = new Date();
		
		passengers.add(passenger1);		
		passengers.add(passenger2);
		
		TrajetBean trajetBean = new TrajetBean(departure,arrival, driver, passengers,dep_date,arr_date);
		
		//System.out.println(trajetBean.proposerTrajet());		
		
		Gson gson = new Gson();
		String respJSON = "";

		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(15);
		
		session.setAttribute("trajet", trajetBean);
		respJSON = gson.toJson(trajetBean);
		
		TRAJETS_PARAM = respJSON;

		
		response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(respJSON);
		
	}

}
