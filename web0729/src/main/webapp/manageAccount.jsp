<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");

String idTmp = "";
String nameTmp = "";
String ssnTmp = "";
String phoneTmp = "";
String balanceTmp = "";
String sqlTmp = "";

request.setCharacterEncoding("UTF-8");        // 한글 처리
String find = request.getParameter("find");   // update하기 전 학번을 클릭하면 넘어오는 매개변수값
String id = request.getParameter("id");     // null이면 insert나 update를 하지 말아야
String name = request.getParameter("name");
String ssn = request.getParameter("ssn");
String phone = request.getParameter("phone");
String balance = request.getParameter("balance");
String delete = request.getParameter("delete");

if (delete != null) {
	sqlTmp = "delete from account where id = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, delete);
	int ret = pstmt.executeUpdate();
}

//update하기 전 id를 클릭하면
if (find != null) {
	sqlTmp = "select * from account where id = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, find);
	ResultSet rs = pstmt.executeQuery();
	if (rs.next()) {
		idTmp = rs.getString("id");
		nameTmp = rs.getString("name");
		ssnTmp = rs.getString("ssn");
		phoneTmp = rs.getString("phone");
		balanceTmp = rs.getString("balance");
	}
}

if (id != null) {
	sqlTmp = "select count(*) from account where id = ?";  // 이미 있는 학번 조회 (있으면 1을 가져옴)
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, id);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	int cnt = rs.getInt(1);  // 0: insert, 1: update
	if (cnt == 1) { // 정보 수정
		sqlTmp = "update account set name = ?, ssn = ?, phone = ?, balance = ? where id = ?";
		pstmt = conn.prepareStatement(sqlTmp);
		pstmt.setString(1, name);
		pstmt.setString(2, ssn);
		pstmt.setString(3, phone);
		pstmt.setString(4, balance);
		pstmt.setString(5, id);
		int ret = pstmt.executeUpdate();
	} else { //정보 입력
		sqlTmp = "insert into account(id, name, ssn, phone, balance) values (?,?,?,?,?)";
		pstmt = conn.prepareStatement(sqlTmp);
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, ssn);
		pstmt.setString(4, phone);
		pstmt.setString(5, balance);
		int ret = pstmt.executeUpdate();
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<style>
        table { width: 600px; text-align: left; }
        th    { width: 40px; background-color: aqua; }
    </style>
<title>계좌 관리 시스템</title>
</head>
<body>
<form>
	id: <input type="text" name="id" value="<%=idTmp %>"><br>
	이름: <input type="text" name="name" value="<%=nameTmp %>"><br>
    주민번호: <input type="text" name="ssn" value="<%=ssnTmp %>"><br>
    전화번호: <input type="text" name="phone" value="<%=phoneTmp %>"><br>
    잔고: <input type="text" name="balance	" value="<%=balanceTmp %>"><br>
    <input type="submit" value="입력/수정">
</form>
<table>
<tr>
        <th>id</th><th>이름</th>
        <th>주민번호</th><th>전화번호</th><th>잔고</th><th>삭제</th>
</tr>

<%
sqlTmp = "select * from account";
pstmt = conn.prepareStatement(sqlTmp);
ResultSet rs = pstmt.executeQuery();

while(rs.next()) {
	idTmp = rs.getString("id");
	nameTmp = rs.getString("name");
	ssnTmp = rs.getString("ssn");
	phoneTmp = rs.getString("phone");
	balanceTmp = rs.getString("balance");
%>	
	<tr>
	<td><a href="?find=<%=idTmp %>"><%=idTmp %></a></td><td><%=nameTmp %></td><td><%=ssnTmp %></td>
	<td><%=phoneTmp %></td><td><%=balanceTmp %></td>
	<td><button  onclick="location.href='?delete=<%=idTmp%>'" >삭제</button></td>
	</tr>
<%
}
%>

</table>
</body>
</html>