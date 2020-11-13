<%@page import="com.service.impl.StuServiceImpl"%>
<%@page import="com.service.StuService"%>
<%@page import="com.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path=request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  action="<%=path %>/UpdateOrAddStu">
		班级编号：<input type="text" name="stuid" value="${stu.stuid}"  readonly="readonly" /> 不能改<br/> 
	
		班级名字：<select  name="gradeid">
			<option value="1">java1901</option>
			<option value="2">java1902</option>
			<option value="3">java1903</option>
		</select>
<br/>
		<input type="submit"value="提交"> 
		<input type="reset" value="重置">
		<input type="button" value="返回" onclick="history.back()">
	</form>

</body>
</html>