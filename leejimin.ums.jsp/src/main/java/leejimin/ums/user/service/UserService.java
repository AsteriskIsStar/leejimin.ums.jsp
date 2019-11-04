package leejimin.ums.user.service;

import java.util.List;

import leejimin.ums.user.vo.UserVo;

public interface UserService {
	List<UserVo> listUsers();
	UserVo findUser(String userNo);
	boolean join(String userName);
	boolean correctUser(UserVo user);
	boolean secede(String userNo);
}
