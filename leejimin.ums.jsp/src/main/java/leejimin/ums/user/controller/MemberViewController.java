package leejimin.ums.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import leejimin.ums.user.dao.UserDao;
import leejimin.ums.user.dao.UserDaoImpl;
import leejimin.ums.user.vo.UserVo;

import org.springframework.web.servlet.ModelAndView;

public class MemberViewController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userNo = request.getParameter("userNo");
		
		UserVo vo = new UserVo();
		UserDao userDao = new UserDaoImpl();
		
		vo.setUserNo(Integer.parseInt(userNo));
		UserVo user = userDao.getUser(userNo);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", user);
		mav.setViewName("memberView");
		
		return mav;
	}

}
