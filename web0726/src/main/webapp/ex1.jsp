<%@page import="java.time.LocalDateTime"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- HTML 주석 -->
<%-- JSP 주석 --%>
<%
	out.println("연습<br>");
	Date now = new Date();
	out.println("<h1>" + LocalDateTime.now()+"</h1>");
%>
지금 시각은 <%=LocalDateTime.now() %>입니다.
</body>
</html>