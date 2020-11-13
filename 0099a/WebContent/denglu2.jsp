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
<style type="text/css">


table{
	width: 800px;
		height: 400px;

margin-top: 12 px;
 margin-right : 2 px;
  margin-bottom : 200px;
   margin-left : 100 px;

		background-color:red;  
	
			
			 padding-left:60px;
			 padding-right:30px; 							/* 与边框上下左右的间距 */
			 padding-top: 30px; 
			 padding-bottom:8px; 
			 
			    border-botom-color:green;
		          border-top-color:green;                            /* 边框上下左右的颜色 */
				    border-right-color:yellow;
				 	 border-left-color:#369;
				 	 
				 	 border-top-width:5px; 
				 	 border-right-width:5px;
				 	  border-bottom-width:5px;                /* 边框上下左右的宽度 */
				 	   border-left-width:5px;
	}


</style>
</head>
<body>
<table style="border-style: solid;">

<form action="<%=path %>/denglu" method="post">
<tr>
<td>账号<input type="text"     name="stuName"        /></td><br/>
</tr>
<tr>
<td>密码<input type="password"        name="stuPwd"              /></td><br/>
</tr>
<tr>
<td><input type="submit"  value="登录" ></td><br/>
</tr>
<tr>
<td><input type="image"  src="images/2.jpg"  width="200px" /></td><br/>		
</tr> 
</form>

</table>

</body>
</html>