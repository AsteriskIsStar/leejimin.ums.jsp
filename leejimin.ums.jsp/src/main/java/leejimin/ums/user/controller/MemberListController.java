package leejimin.ums.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import leejimin.ums.user.dao.UserDao;
import leejimin.ums.user.dao.UserDaoImpl;
import leejimin.ums.user.vo.UserVo;

import org.springframework.web.servlet.ModelAndView;

public class MemberListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		UserDao userDao = new UserDaoImpl();
		
		List<UserVo> userList = userDao.getUsers();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userList", userList);
		
		mav.setViewName("memberList");
		
		return mav;
	}

}
