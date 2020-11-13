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
		//application 作用域是整个应用程序  存放在这个作用域的内容 
		//只要服务器不关闭 多个浏览器访问这个数据  可以共享这个数据 
		//比如我们使用application作用域存放显示 当前网站的在线人数 
		
		//1.先来获取存在于应用程序范围的一个值 名字叫count
		Object count=application.getAttribute("count");
		//2.如果当前获取的是null  表示目前还没有人访问这个系统
		if(count==null){
			//手动的设置一个count属性 初始值为1  表示第一次访问
			application.setAttribute("count", 1);
		}else{
			//否则表示不是第一次访问 先把原来的值转换为Integer
			Integer newCount=(Integer)count;
			//然后再在原来的基础上+1 
			application.setAttribute("count", newCount+1);
		}
		out.print("当前网站的访问人数是"+application.getAttribute("count"));
	%>
</body>
</html>