package covoit.subs.servlet;
import covoit.beans.LocationBean;
import covoit.beans.TrajetBean;
import covoit.beans.UserBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
@WebServlet("/trajectneartolocation")
public class TrajectNearToLocation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<LocationBean> ListeTrajets;
	private ArrayList<LocationBean> ListeTrajetsFinaux;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrajectNearToLocation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date1 = null;
		Date date2 = null;
		Date date3 = null;
		Date date4 = null;
		Date date5 = null;
		Date date6 = null;
		Date date7 = null;
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String Sdate1 = "22/02/2018";
		String Sdate2 = "23/02/2018";
		String Sdate3 = "24/02/2018";
		String Sdate4 = "25/02/2018";
		String Sdate5 = "26/02/2018";
		String Sdate6 = "27/02/2018";
		String Sdate7 = "28/02/2018";
		
		try {
			date1 = simpleDateFormat.parse(date1);
			date2 = simpleDateFormat.parse(date2);
			} catch (ParseException e) {
			e.printStackTrace();
			}
		date1 = simpleDateFormat.parse(date1);
		Gson gson = new Gson();
		String json= gson.toJson("unexpected error");
		if(request.getParameter("lng")!=null&&request.getParameter("lat")!=null) {
		ListeTrajets = new ArrayList();
		ListeTrajetsFinaux = new ArrayList();
		LocationBean location1 = new LocationBean("capitole",43.604652,1.444209);
		LocationBean location2 = new LocationBean("capitole",43.605000,1.444209);
		LocationBean location3 = new LocationBean("capitole",43.606000,1.444209);
		LocationBean location4 = new LocationBean("capitole",43.607000,1.444209);
		LocationBean location5 = new LocationBean("capitole",43.608000,1.444209);
		LocationBean location6 = new LocationBean("capitole",43.609000,1.444209);
		LocationBean location7 = new LocationBean("capitole",43.610000,1.444209);
		UserBean driver = new UserBean("jean-michel","bruel","jmb@iut.fr","0102030405","Hash");
		Set<UserBean> passengers = new HashSet<>();
		Date dateDepart = new Date(2018,02,25);
	
		
		TrajetBeans Trajet1 = new TrajetBean(location1,location4,driver,passengers,);
		
		ListeTrajets.add(location1);
		ListeTrajets.add(location2);
		ListeTrajets.add(location3);
		ListeTrajets.add(location4);
		ListeTrajets.add(location5);
		ListeTrajets.add(location6);
		ListeTrajets.add(location7);
		
		for(int i = 0;i<ListeTrajets.size();i++) {
			if(ListeTrajets.get(i).getLongitude() > (Double.parseDouble(request.getParameter("lng"))-0.002) &&
			   ListeTrajets.get(i).getLongitude() < (Double.parseDouble(request.getParameter("lng"))+0.002) &&
			   ListeTrajets.get(i).getLatitude() > (Double.parseDouble(request.getParameter("lat"))-0.002) &&
			   ListeTrajets.get(i).getLatitude() < (Double.parseDouble(request.getParameter("lat"))+0.002) )
				ListeTrajetsFinaux.add(ListeTrajets.get(i));
		}
		
		
			json = gson.toJson(ListeTrajetsFinaux);
		}else {
			json = gson.toJson("error no lat or lng provided");
		}
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
