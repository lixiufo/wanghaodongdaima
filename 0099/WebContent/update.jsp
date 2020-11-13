<%-- <%@page import="com.service.impl.HouserServiceImpl"%>
<%@page import="com.service.HourseService"%>
<%@page import="com.entity.Hourse"%>  --%>
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
<script type="text/javascript">
function gotoAdd() {
	window.location="/0099a/show.jsp";
}

</script>
</head>
<body>

	<form  action="<%=path %>/tijiaofangyuan">
	 
		房屋描述：<input type="text"name="description" value="${s.description}" id="stuname" onblur="checkNameByJquery()"/><span id="span1"></span><br/> 
		户&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;型：<input type="text" name="housetype"value="${s.housetype}" /> <br/>
		租&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;金：<input type="text" name="money"  value="${s.money}"          /> <br/>
		房屋编号：<select  name="gradeid">
			<option value="1">3室2厅</option>
			<option value="2">2室1厅</option>
			<option value="3">3室2厅</option>
		</select> 
<br/>
		<input type="submit"value="提交"> 
		<input type="reset" value="重置"   onclick="gotoAdd()">
		<input type="button" value="返回" onclick="history.back()">
	</form>

</body>
</html>