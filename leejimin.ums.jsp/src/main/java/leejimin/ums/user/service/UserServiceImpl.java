package leejimin.ums.user.service;

import java.util.List;

import leejimin.ums.user.dao.UserDao;
import leejimin.ums.user.vo.UserVo;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public List<UserVo> listUsers() {
		return userDao.getUsers();
	}

	@Override
	public UserVo findUser(String userNo) {
		return userDao.getUser(userNo);
	}

	@Override
	public boolean join(String userName) {
		return userDao.addUser(userName)>0;
	}

	@Override
	public boolean correctUser(UserVo user) {
		return userDao.updateUser(user)>0;
	}

	@Override
	public boolean secede(String userNo) {
		return userDao.delUser(userNo)>0;
	}

}
