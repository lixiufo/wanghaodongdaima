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
<script src="<%=path%>/js/jquery.js" type="text/javascript"></script>
<script type="text/javascript">
function checkStuName(){
	var stuname=document.getElementsByTagName("id").value;
	if(stuname==null || stuname==""){
		document.getElementById("span1").innerHTML="用户名不能为空";
		document.getElementById("span1").style.color="red";
		return false;
	}else{
		//XMLHttpRequest  这个是ajax的核心对象
		//提供的有一些列的用于执行请求
		//获得请求 发送请求的方法和属性 
		var xhr=new XMLHttpRequest();
		
		
		                
		                  //checkName
		var url="/0099a/chongfumingzi?stuname="+stuname;
		//open需要三个参数 第一个  请求方式 get或者 post
		//第二个 请求的路径 
		//第三个 是否是异步的  true
		xhr.open("get",url,true);
		//发送请求
		xhr.send();
		//onreadystatechange这个属性表示当我们的请求组的状态码发生变化的时候
		//将会执行下边这个function
		//0-4
		//0 表示请求初始化
		//1 请求连接中
		//2 请求发送中
		//3 请求响应中
		//4 请求完毕 请求发送成和响应 完毕    
		//http状态码   404 资源部存在 
		//200 请求完成并且没有错误 
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4 && xhr.status==200){
				//响应的文本内容  我们拿到以后做响应的操作
				//比如 拿到的true 就显示用户名可用
				//否则提示已经存在
				var resText=xhr.responseText;
				if(resText=="true"){
					document.getElementById("span1").innerHTML="ok√";
					document.getElementById("span1").style.color="green";
					return true;
				}else{
					document.getElementById("span1").innerHTML="用户名已经存在";
					document.getElementById("span1").style.color="red";
					return false;
			}
		}
	}
}
}
function checkNameByJquery(){
	//var stuname=document.getElementById("stuname").value;
	//标签 id  类
	var stuname=$("#stuname").val();
	if(stuname==null || stuname==""){
		$("#span1").css("color","red").html("用户名不能为空");
	}else{
		$.ajax({
			//要发送请求 需要哪些东西
			//地址
			//请求方式
			//参数
			//回调函数            //checkName
			url:"/0099a/chongfumingzi",
			data:{"stuname":stuname},
			type:"get",
			success:function(res){
				if(res=="true"){
					$("#span1").css("color","green").html("ok√");
				}else{
					$("#span1").css("color","red").html("用户名已存在");
				}
			}
		})
	}
}

</script>
</head>
<body>

<%
String sid=request.getParameter("stuid");
if(sid!=null){
		int stuid=Integer.parseInt(sid);
		StuService ss=new StuServiceImpl();
		Student stu=ss.getStuById(stuid);
		request.setAttribute("stu", stu);
}
%>

	<form  action="<%=path %>/UpdateOrAddStu">
		编号：<input type="text" name="stuid" value="${stu.stuid}"  readonly="readonly" /> 不能改<br/> 
	姓名：<input type="text"name="stuname" value="${stu.stuname}" id="stuname" onblur="checkNameByJquery()"/><span id="span1"></span><br/> 
		年龄：<input type="text" name="stuage"value="${stu.stuage}" /> <br/>
		生日：<input type="date" name="stubir" /> <br/>
		班级编号：<select  name="gradeid">
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