<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.main {
	width: 400px;
	margin: auto;
	margin-top : 100px;
	text-align: center;
}

.mainTable {
	text-align: right;
	width: 300px;
	margin: auto;
}
	input{
		width: 200px;
		height: 30px;
	}

</style>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	int selectNum = Integer.parseInt(request.getParameter("selectNum"));
	
	Random rd = new Random();
	int set = rd.nextInt(selectNum)+1;

	%>


	<div class="main">
		<fieldset>
			<legend>랜덤 숫자 입력</legend>
			<form action="exam11randomWinner.jsp" method="post">
			<input type="hidden" name="selectNum" value="<%=selectNum %>">
				<table class="mainTable">
					<tr>
						<td>주제 :</td>
						<td><input type="text" name="title"></td>
					</tr>
					<%
						for (int i = 1; i <= selectNum; i++) {

						out.print("<tr>");
						out.print("<td>아이템" + i + " : </td>");
						out.print("<td><input type=text name=item_" + i + "></td>");
						out.print("</tr>");
					}
					%>
					<tr>
						<td></td>
						<td><input type="submit" value="시작" style="width: 208px;  height: 35px;"></td>
					</tr>
				</table>
				
			</form>
		</fieldset>
	</div>

</body>
</html>