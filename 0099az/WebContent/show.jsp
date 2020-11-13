<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<%
	String path = request.getContextPath();
%>>

<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function gotoAdd() {
		window.location="/0099az/update.jsp";
	}
	function ckeckAll(){
		var stuids=document.getElementsByName("stuids");
		for(var i=0;i<stuids.length;i++){
			stuids[i].checked=true;
		}
	}
	function invertCheck(){
		var stuids=document.getElementsByName("stuids");
		for(var i=0;i<stuids.length;i++){
			stuids[i].checked=false;
			
		}
	}
	function distinctDel(){
		var stuids=document.getElementsByName("stuids");
		var ids=[];
		for(var i=0;i<stuids.length;i++){
			if(stuids[i].checked){
				ids[i]=stuids[i].value;
		     }
		}
		if(ids.length>0){
		window.location.href="/0099az/delStu?stuids="+ids;
	}
	}
</script>
 <style type="text/css">
	td{
		text-align: center;;
	}
	
	table{
	
	fontcolor:red;
	
	}
</style>




<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<div>
		欢迎内心险恶的人们:${stuname} <a href="<%=path%>/logout"  >注销</a>
			<input type="button" value="添加信息" onclick="gotoAdd()">
			<input type="button" value="全选" onclick="ckeckAll()">
			<input type="button" value="反选" onclick="invertCheck()">
			<input type="button" value="批量删除" onclick="distinctDel()">
			<br/><form action="<%=path %>/getAllByPageFuzzy" method="post">
			学生名字	:<td><input type="text"   name="stuname"  >   </td>
			学生班级	: <td><input type="text"   name="grade"  >   </td>
			<input type="submit" value="查询" >
			</form>
	</div>


	<table  style="border-style: solid; background-color:red; color:yellow; ">
		<tr>
			<td>学生编号</td>
			<td>学生姓名</td>
			<td>学生年龄</td>
			<td>学生生日</td>
			<td>学生班</td>
		</tr>



		<c:forEach items="${list}" var="stu">
	
			<tr>
				<td>${stu.stuid}</td>
				<td>${stu.stuname}</td>
				<td>${stu.stuage}</td>
				<td>${stu.stubir }</td>
				 <td>${stu.grade.gname}</td>
				  <td><input type="checkbox" name="stuids" value="${stu.stuid}" ></td>
				<td><a href="<%=path%>/delStu?stuids=${stu.stuid}"
					onclick="if(confirm('确定删除'+'${stu.stuname}'+'?')==false)return false">删除</a></td>
				<td><a href="<%=path%>/update.jsp?stuid=${stu.stuid}">修改</a></td>
		
			</tr>
		
		</c:forEach>
 </table>            
 <table>            
		<tr>
			<td>一共有${dataCount}条数据，一共${pageCount}页，当前是${pageNo}页</td>
		</tr>
		
		 	<%
 		Object objNo=request.getAttribute("pageNo");
 		Object objCount=request.getAttribute("pageCount"); 
 		int pageNo=0;
 		int pageCount=0;
 		if(objNo!=null){
 			pageNo=Integer.parseInt(objNo.toString());
 		}
 		if(objCount!=null){
 			pageCount=Integer.parseInt(objCount.toString());
 		}
 		if(pageNo>1){
				%>
			 	<!--  当我们在首页的时候 不应该显示上一页  在尾页的时候不应该显示 下一页  -->
			 		<td><a href="<%=path%>/getAllByPage?pageNo=1">首页</a></td>
			 		<td><a href="<%=path%>/getAllByPage?pageNo=${pageNo-1}">上一页</a></td>
			 		<%
			 		}
			 		if(pageNo<pageCount){
			 		%>
			 		<td><a href="<%=path%>/getAllByPage?pageNo=${pageNo+1}">下一页</a></td>
			 		<td><a href="<%=path%>/getAllByPage?pageNo=${pageCount}">尾页</a></td>
			 		<%
			 		}
			 	%>
		</tr>
	</table>

</body>
</html>