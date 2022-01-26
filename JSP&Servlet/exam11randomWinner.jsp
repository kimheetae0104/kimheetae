<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	.main{
		width : 400px;
		margin : auto;
		margin-top : 100px;
		text-align: center;
	}

</style>
</head>
<body>
	<%
	// 인코딩 설정 및 데이터 받기
		request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	int selectNum = Integer.parseInt(request.getParameter("selectNum"));
	String title = request.getParameter("title");
	
	// 여러게 생성된 데이터 받기
	String[] item = new String[selectNum];
	for(int i = 1; i <= selectNum; i++){
		item[i-1] = request.getParameter("item_"+i);
	}
	
	// 랜덤을 이용하여 하나 선택
	Random rd = new Random();
	int randomNum = rd.nextInt(selectNum);
	String setlectItem = item[randomNum];

	%>


	<div class="main">
		<fieldset class="field">
			<legend>랜덤당첨결과</legend>
			<%=title %><br>
			<%=setlectItem %>
		</fieldset>
	</div>


<body>

</body>
</html>