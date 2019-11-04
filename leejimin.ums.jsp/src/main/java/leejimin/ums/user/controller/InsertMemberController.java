package leejimin.ums.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import leejimin.ums.user.dao.UserDao;
import leejimin.ums.user.dao.UserDaoImpl;
import leejimin.ums.user.vo.UserVo;

public class InsertMemberController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		
		UserVo vo = new UserVo();
		vo.setUserName(userName);
		
		UserDao userDao = new UserDaoImpl();
		userDao.addUser(userName);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:getUserList.do");
		return mav;
	}

}
