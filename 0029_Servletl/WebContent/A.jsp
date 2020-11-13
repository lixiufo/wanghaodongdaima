<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="b.jsp"  method="post">
学生姓名:<input type="text" name="stuName"/><br/>
性别:<input type="radio" name="sex" value="male"/>男
<input type="radio" name="sex" value="fmale"/>女<br/>
请选择班级:<select name="grade">
<option value="1">java1905</option>
<option value="2">java1906</option>
<option value="3">java1907</option>
</select>
<input type="checkbox" name="hobby" value="smoke">抽烟
	 	<input type="checkbox" name="hobby" value="drink">喝酒
	 	<input type="checkbox" name="hobby" value="perm">烫头
	 	<input type="submit" value="提交"> 
</form>











</body>
</html>