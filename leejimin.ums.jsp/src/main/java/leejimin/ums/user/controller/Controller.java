package leejimin.ums.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface Controller {
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response)
		throws ServletException, IOException;
						
}
