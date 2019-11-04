package leejimin.ums.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import leejimin.ums.user.dao.UserDao;
import leejimin.ums.user.dao.UserDaoImpl;
import leejimin.ums.user.vo.UserVo;

import org.springframework.web.servlet.ModelAndView;

public class DeleteMemberController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userNo = request.getParameter("userNo");
		
		UserVo vo = new UserVo();
		vo.setUserNo(Integer.parseInt(userNo));
		
		UserDao userDao = new UserDaoImpl();
		userDao.delUser(userNo);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:memberList.do");
		return mav;
	}

}
