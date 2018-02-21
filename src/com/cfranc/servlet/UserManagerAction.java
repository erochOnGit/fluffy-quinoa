package com.cfranc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserManagerAction
 */
@WebServlet("/users")
public class UserManagerAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// View
    public static String VIEW_PAGES_URL="/WEB-INF/user.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserManagerAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher(VIEW_PAGES_URL).include( request, response );
		response.getWriter().append("la bonne servlet lalala ").append(request.getContextPath());
		HttpSession session = request.getSession();
		System.out.println(session);
		System.out.println(session.getAttribute("users").toString());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
