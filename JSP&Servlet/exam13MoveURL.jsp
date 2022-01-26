<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 여기에서 네이버, 다음, 구글 해당되는 값에 따라 페이지를 이동하시오 -->
	<%
	request.setCharacterEncoding("UTF-8");
	
	String url = request.getParameter("url");
		response.sendRedirect(url);
/* 	
	if(url.equals("네이버")){
			response.sendRedirect("https://www.naver.com");
	}else if(url.equals("다음")){
			response.sendRedirect("https://www.daum.net");
	}else if(url.equals("구글")){
			response.sendRedirect("https://www.google.com");
	}	 */
	%>
	<form action="exam13MoveURL.jsp" method="post">
		<select name="url">
			<option>네이버</option>
			<option>다음</option>
			<option>구글</option>
		</select> 
		<input type="submit">
	</form>
	
</body>
</html>