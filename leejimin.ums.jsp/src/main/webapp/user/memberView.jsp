<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="leejimin.ums.user.dao.UserDao" %>
<%@ page import="leejimin.ums.user.vo.UserVo" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<mapper namespcaae="leejimin.ums.dao.mapper.UserMap.xml">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="user_info">
			<p id="if_head">상세정보</p>
			<form name="memberView" method="POST" action="updateUser.do">
				<div class="if_box">
					<input type="hidden" name="userNo" value="${user.getUserNo()}">
				</div>
			</form>
		</div>
	</div>
</body>
</html>