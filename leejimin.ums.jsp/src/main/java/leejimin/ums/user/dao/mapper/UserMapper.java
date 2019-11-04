package leejimin.ums.user.dao.mapper;

import java.util.List;

import leejimin.ums.user.vo.UserVo;

public interface UserMapper {
	List<UserVo> getUsers();
	UserVo getUser(String userNo);
	int addUser(String userName);
	int updateUser(UserVo user);
	int delUser(String userNo);
}
