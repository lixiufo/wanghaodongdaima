<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<%
	String path = request.getContextPath();
%>>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		班级编号:${gid} <a href="<%=path%>/logout"  >注销</a>
			<input type="button" value="添加信息" onclick="gotoAdd()">
			<input type="button" value="全选" onclick="ckeckAll()">
			<input type="button" value="反选" onclick="invertCheck()">
			<input type="button" value="批量删除" onclick="distinctDel()">
			<br/><form action="<%=path %>/getAllByPageFuzzy" method="post">
			班级编号	:<td><input type="text"   name="stuname"  >   </td>
			班级名称	: <td><input type="text"   name="grade"  >   </td>
			<input type="submit" value="查询" >
			</form>
	</div>


	<table  style="border-style: solid; background-color:green; color:yellow; ">
		<tr>
			<td>班级编号</td>
			<td>班级名字</td>
		
		</tr>



		<c:forEach items="${list}" var="gra">
	
			<tr>
				<td>${gra.gid}</td>
				<td>${gra.gname}</td>
			
			
		<%-- 	  <td><input type="checkbox" name="stuids" value="${gra.gid}" ></td>
			 <td><a href="<%=path%>/delStu?stuids=${gra.gid}" 
					onclick="if(confirm('确定删除'+'${stu.stuname}'+'?')==false)return false">删除</a></td> --%>
				<td><a href="<%=path%>/update2.jsp">修改</a></td> 
		
			</tr>
		
		</c:forEach>
 </table> 
</body>
</html>