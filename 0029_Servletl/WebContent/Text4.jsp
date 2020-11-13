<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%
    	String path=request.getContextPath();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=path %>/loginServlet" method="post">
		请输入用户名：<input type="text" name="stuName">
		请输入密码:<input type="password" name="stuPwd">
		<input type="submit" value="登录">
	</form>
</body>
</html>