package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/signout"})
public class SignOutController extends HttpServlet{
	private static final long serialVersionUID = 6036731501362521420L;
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession(false);
		if( session != null )
		{
			session.getLastAccessedTime();
			session.invalidate();
			getServletContext().getSessionCookieConfig().setHttpOnly(true);
		}
		RequestDispatcher view = getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");
		view.forward(request, response);
	}
}
