package leejimin.ums.user.dao;

import java.util.List;

import leejimin.ums.config.Configuration;
import leejimin.ums.user.dao.mapper.UserMapper;
import leejimin.ums.user.vo.UserVo;

public class UserDaoImpl implements UserDao{
	
	private UserMapper userMapper;
	
	public UserDaoImpl(){
		this.userMapper = Configuration.getMapper(UserMapper.class);
	}
	
	@Override
	public List<UserVo> getUsers() {
		return userMapper.getUsers();
	}

	@Override
	public UserVo getUser(String userNo) {
		return userMapper.getUser(userNo);
	}

	@Override
	public int addUser(String userName) {
		return userMapper.addUser(userName);
	}

	@Override
	public int updateUser(UserVo vo) {
		return userMapper.updateUser(vo);
	}

	@Override
	public int delUser(String userNo) {
		return userMapper.delUser(userNo);
	}

}
