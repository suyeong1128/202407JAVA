<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>색깔을 선택하세요</title>
</head>
<body>
<form action=colorResult.jsp method="post">
	<h1>If-else Example</h1>
	이름 : 
	<input type = "text" name ="name"><br>
	좋아하는 색깔 : 
	<select name="color">
	<option value="blue">파란색</option>
	<option value="red">빨간색</option>
	<option value="yellow">노란색</option>
	</select><br>
	<input type="submit">
</form>
</body>
</html>