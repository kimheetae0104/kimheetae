<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

<%
request.setCharacterEncoding("UTF-8");
		
	try{
		int layer = Integer.parseInt(request.getParameter("layer"));
		int room = Integer.parseInt(request.getParameter("room"));
		
		out.print("<h1>"+layer+"층</h1>");
		out.print("<h1>"+room+"개의 방</h1>");
		out.print("<table width = 400px height=400px align='center' border='1px solid black'>");
		for(int i =0; i<layer;i++){
			out.print("<tr>");
			for(int j = 0; j<room; j++){
				out.print("<td style='font-size:80px'>"+(j+1)+"</td>");
			}
			out.print("</tr>");
		}
		out.print("</table>");}catch(Exception e){
			out.print("<h1>"+"뭔가 잘 못 입력했습니다"+"</h1>");
		}
	%>
	
	
	
	
</body>
</html>