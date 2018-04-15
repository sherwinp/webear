package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
public class IndexController extends HttpServlet{

	private static final long serialVersionUID = 8036731501362521420L;
	@RequestMapping(value= {"/index.html","/"})
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {
		 
		 return new ModelAndView("index");
	 }
}