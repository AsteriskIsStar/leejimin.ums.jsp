package leejimin.ums.user.vo;

import java.sql.Date;

public class UserVo {
	private int userNo;
	private String userName;
	private Date regDate;
	
	public UserVo(){}
	
	public UserVo(int userNo, String userName, Date regDate){
		this.userNo = userNo;
		this.userName = userName;
		this.regDate = regDate;
	}
	
	//getter, setter
	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString(){
		return String.format("%d %-6s %s", userNo, userName, regDate);
	}
}
