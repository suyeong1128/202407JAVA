<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int dan = Integer.parseInt(request.getParameter("number"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=dan %></title>
</head>
<body>
<table border="1">
<tr><th><%=dan %>단</th></tr>
<% 
		for(int j = 1; j <= 9; j++){
%>
	<tr><td><%=dan %>X<%=j %>=<%=dan*j %></td></tr>
<%
		}
%>
</table>
</body>
</html>