<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	int sum = 0;
	for(int i =1; i <=100; i++) {
		sum +=i;
	}
	%>
	1에서 100까지의 합은 <b><%= sum %></b>이된다
</body>
</html>