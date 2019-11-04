<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="leejimin.ums.user.dao.UserDao"%>
<%@ page import="leejimin.ums.user.vo.UserVo"%>

<!-- 추가 JSTL 적용 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<mapper namespcaae="leejimin.ums.dao.mapper.UserMap.xml">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 리스트</title>
</head>
<body>
	<form name="listForm">
		<div class="container">
			<div class="mlist">
				<p id="mlist_head">회원 리스트</p>

				<!-- 새 글 등록 버튼 -->

				<div class="btn_wrap">
					<span id="btn_insert"> <a href="memberInsert.jsp"
						class="btn">회원 등록</a>
					</span>
				</div>

				<div class="list_box" id="list_box" style="display: block">
					<table class="list_box_tb">
						<colgroup>
							<col style="width: 80px">
							<col style="width: 648px">
							<col style="width: 200px">
						</colgroup>

						<thead>
							<tr>
								<th>순 서</th>
								<th>이 름</th>
								<th>등록일</th>
							</tr>
						</thead>

						<tbody id="list_index">
							<c:forEach var="user" items="${memberList}">
								<tr>
									<td align="center">${user.getUserNo()}</td>
									<td align="center">${user.getName()}</td>
									<td align="center">${user.getRegDate()}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</form>
</body>
</html>