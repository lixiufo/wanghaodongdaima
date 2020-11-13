<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String str1="张三";
String str2=new String(str1.getBytes("iso-8859-1"),"utf-8");




request.setCharacterEncoding("utf-8");
out.print(request.getParameter("stuName"));


String []sex=request.getParameterValues("sex");
for(String str : sex){
	out.print("你选择的性别是"+str);
}


String [] grade=request.getParameterValues("grade");
for(String str : grade){
	out.print("你选择的班级是"+str);
}


String [] hobby=request.getParameterValues("hobby");
for(String str: hobby){
	out.print("你选择的爱好是"+str);
}
%>





</body>
</html>