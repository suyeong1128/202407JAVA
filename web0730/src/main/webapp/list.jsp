<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 데이터베이스 접속
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");
request.setCharacterEncoding("UTF-8");        // 한글 처리
String sql = "select * from board";
pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table     { width:680px; text-align:center; }
        th        { background-color:cyan; }
        
        .num      { width: 80px; }
        .title    { width:230px; }
        .writer   { width:100px; }
        .content  { width:120px; }
        .regtime  { width:180px; }
        .hits     { width:80px;  }
                
        a:link    { text-decoration:none; color:blue; }
        a:visited { text-decoration:none; color:gray; }
        a:hover   { text-decoration:none; color:red;  }
    </style>
</head>
<body>
<table>
<tr>
	<th class="num"    >번호    </th>
    <th class="writer" >작성자  </th>
    <th class="title"  >제목    </th>
    <th class="content">글 내용 </th>
   	<th class="regtime">작성일시</th>
    <th class="hits"   >조회수  </th>
</tr>
<%
while(rs.next()) {
	String num = rs.getString("num");
	String writer = rs.getString("writer");
	String title = rs.getString("title");
	String content = rs.getString("content");
	String regtime = rs.getString("regtime");
	String hits = rs.getString("hits");
%>	
	<tr>
	<td><a href="view.jsp?num=<%=num %>"><%=num %></a></td><td><%=writer %></td><td><%=title %></td>
	<td><%=content %></td><td><%=regtime %></td><td><%=hits %></td>
	</tr>
<%
}
%>

</table>

<br>
<input type="button" value="글쓰기" onclick="location.href='write.jsp'">
</body>
</html>