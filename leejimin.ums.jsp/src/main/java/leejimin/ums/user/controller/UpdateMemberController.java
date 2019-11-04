package leejimin.ums.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import leejimin.ums.user.dao.UserDao;
import leejimin.ums.user.dao.UserDaoImpl;
import leejimin.ums.user.vo.UserVo;

import org.springframework.web.servlet.ModelAndView;

public class UpdateMemberController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		
		UserVo vo = new UserVo();
		String userNo = request.getParameter("userNo");
		vo.setUserNo(Integer.parseInt(userNo));
		
		UserDao userDao = new UserDaoImpl();
		UserVo user = userDao.getUser(userNo);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", user);
		mav.setViewName("memberUpdate");
		return mav;
	}

}
