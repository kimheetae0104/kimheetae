<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <!-- JSP에서 정수형 변수 num에 100을 넣고 웹페이지에 출력  -->
      <!-- html 주석은 개발자 도구에서 보이게 되는데   -->
      <%-- jsp 주석   개발자 도구에서 보이지 않음 --%>
<!--       jsp에서 java코드를 사용하고 싶다면 스크립트릿을 사용해라  -->
      <%  //이구간은 servlet 구간이라고 생각하면 좋음/ 
      
//      이안은 java만 적용되고 인식됨 그리고 java 주석을 씀 이것 또한 개발자도구에서 안보임 
      int num = 100;
      
      %>
      <%-- jsp 에서 java 변수의 값을 웹페이지로 꺼내고 싶을 대는 표현식을 사용한다 --%>
      num의 값 : <%= num %> <br>
      <hr width="500px" size = "<%= num %>px" color="red">
      
      
      
</body>
</html>