package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/index.html","/"})
public class IndexController extends HttpServlet{

	private static final long serialVersionUID = 8036731501362521420L;

	 public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {
		 RequestDispatcher view = getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp");
		 view.forward(request, response);
	 }
}