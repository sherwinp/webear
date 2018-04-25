package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@ControllerAdvice
public class SignOutController{
	private static final long serialVersionUID = 6036731501362521420L;
	@RequestMapping(value={"/signout.html"}, method = RequestMethod.GET)
	public String signout	(HttpServletRequest request, HttpServletResponse response, SessionStatus sessionStatus) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		if( session != null )
		{
			session.getLastAccessedTime();
			session.invalidate();
			sessionStatus.setComplete();
			
		}
		return "redirect:index.html";
	}
}
