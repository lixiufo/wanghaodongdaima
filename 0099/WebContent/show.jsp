<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<%
	String path = request.getContextPath();
%>

<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function gotoAdd() {
		window.location="/0099a/update.jsp";
	}

</script>
 <style type="text/css">
	td{
		text-align: center;;
	}
	tr:nth-child(2n){


background-color: #fbc9a7


}
	
/* 	table{
	fontcolor:red;
	} */
</style>




<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<div>
	
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="发布房源" onclick="gotoAdd()">

			</form>
	</div>


	<table  style="border-style: solid; /* background-color:red; */ color:red; ">
		<tr>
			<td>房子编号</td>
			<td>房子描述</td>
			<td>户型</td>
			<td>钱</td>
			<td>时间</td>
		</tr>



		<c:forEach items="${list}" var="stu">
	
			<tr>
			
				<td>${stu.id}</td>
				<td>${stu.description}</td>
				<td>${stu.housetype}</td>
				<td>${stu.money }</td>
			 <td>${stu.time}</td>
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
			 		<td><a href="<%=path%>/FenYeBianLi?pageNo=1">首页</a></td><br/>
			 		<td><a href="<%=path%>/FenYeBianLi?pageNo=${pageNo-1}">上一页</a></td><br/>
			 		<%
			 		}
			 		if(pageNo<pageCount){
			 		%>
			 		<td><a href="<%=path%>/FenYeBianLi?pageNo=${pageNo+1}">下一页</a></td><br/>
			 		<td><a href="<%=path%>/FenYeBianLi?pageNo=${pageCount}">尾页</a></td><br/>
			 		<%
			 		}
			 	%>
		</tr>
	</table>

</body>
</html>