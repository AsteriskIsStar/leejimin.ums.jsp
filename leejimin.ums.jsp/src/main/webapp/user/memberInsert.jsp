<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<mapper namespcaae="leejimin.ums.dao.mapper.UserMap.xml">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
	<center>
		<div class="container">
			<p id="add_head">회원 등록하기</p>
			<form name="add_form" method="POST" action="insertUser.do">
				<table class="add_form">
					<colgroup>
						<col style="width: 179px">
						<col style="width: auto;">
					</colgroup>
					<tbody>
						<tr>
							<th>이름</th>
							<td>
								<div class="input_name">
									<input type="text" name="m_name" id="m_name">
								</div>
							</td>
							<td>
								<div class="btn_wrap">
									<input type="submit" value="등록" id="add_user">
								</div>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	</center>
</body>
</html>