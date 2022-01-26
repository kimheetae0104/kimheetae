<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String java = request.getParameter("java");
	int mdJava = Integer.parseInt(java);
	String web = request.getParameter("web");
	int mdWeb = Integer.parseInt(web);
	String iot = request.getParameter("iot");
	int mdIot = Integer.parseInt(iot);
	String android = request.getParameter("android");
	int mdAndroid = Integer.parseInt(android);
	double avg = 0;
	avg = (mdJava + mdWeb + mdIot + mdAndroid) / 4.0;
	String score = "";
	if (avg <= 100 && avg >= 95) {
		score = "A+";
	} else if (avg >= 85) {
		score = "A";
	} else if (avg >= 80) {
		score = "B+";
	} else if (avg >= 70) {
		score = "C";
	} else {
		score = "F";
	}
	%>

	<fieldset>
		<legend>학점확인프로그램</legend>
		<table>
			<tr>
				<td>이름</td>
				<td><%=name%></td>
			</tr>
			<tr>
				<td>JAVA점수</td>
				<td><%=java%></td>
			</tr>
			<tr>
				<td>WEB점수</td>
				<td><%=web%></td>
			</tr>
			<tr>
				<td>IOT점수</td>
				<td><%=iot%></td>
			</tr>
			<tr>
				<td>ANDROID점수</td>
				<td><%=android%></td>
			</tr>
			<tr>
				<td>평균</td>
				<td><%=avg%></td>
			</tr>
			<tr>
				<td>학점</td>
				<td><h3><%=score%></h3></td>
			</tr>
		</table>
	</fieldset>

</body>
</html>