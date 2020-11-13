<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<script type="text/javascript">
function distinctDel(){
	var goods=document.getElementsByName("goodsid");
	var ids=[];
	for(var i=0;i<goods.length;i++){
		if(goods[i].checked){
			ids[i]=goods[i].value;
	     }
	}
	if(ids.length>0){
	window.location.href="/fengmiwang/delStu?goodsid="+ids;
}
}
</script>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>用户登录</title>

	<!-- Bootstrap -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

	<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
	<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
	<!--[if lt IE 9]>
	<script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
	<![endif]-->
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</head>

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>

	<style>
		th {
			text-align: center;
		}

	</style>

	<script>
		// 弹框初始化操作
		$(function () {
			$('[data-toggle="popover"]').popover();

		});

		function showAdd(){
			location.href="<%=path %>/after/add_goods.jsp";
		}
	</script>
	<body>

		<nav class="navbar navbar-inverse" style="margin-bottom: 0px;">
			<div class="container">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					 aria-expanded="false">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">锋迷网管理系统</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">商品管理 <span class="sr-only">(current)</span></a></li>
						<li><a href="<%=path %>/T_goodsTypebianli" method="post">商品类型管理</a></li>
						<li><a href="<%=path %>/userFuzzy" method="post">用户管理</a></li>
						<li><a href="#">订单管理</a></li>
						<li><a href="../before/index.html">直通锋迷网</a></li>
					</ul>

					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="<%=path %>/after/login.jsp" method="post">admin</a>

						</li>
						<li> <a href="<%=path %>/after/login.jsp" method="post"><span class="glyphicon glyphicon-log-in" style="padding-left:0px"></span></a> </li>
						<li> <a href="<%=path %>/after/login.jsp" method="post" style="padding-left:0px">退出</a> </li>

					</ul>
				</div><!-- /.navbar-collapse -->
			</div><!-- /.container-fluid -->
		</nav>
		<div class="jumbotron" style="padding-top:20px;padding-bottom:25px">
			<div class="container">
				<h2>商品管理</h2>

			</div>


		</div>
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<button type="button" onclick="showAdd()" id="addBtn" class="btn btn-info">添加商品</button>
		
					 <input type="button" value="批量删除" onclick="distinctDel()">
				</div>
				<div class="col-md-6" style="text-align: right;padding-right: 25px;">
					<form class="form-inline"  action="<%=path %>/zhumohu" method="post" >
					
					
						<div class="form-group">
							<input type="text" class="form-control" id="exampleInputName1" placeholder="商品名称" name="goodsName">
						</div>
						<div class="form-group">
							<div class="dropdown">
								<button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown"
								 aria-haspopup="true" aria-expanded="false">
									--商品类型--
									<span class="caret"></span>
								</button>
								<ul class="dropdown-menu" aria-labelledby="dropdownMenu2">
									<li><a href="<%=path%>/T_goodsTypebianli">手机</a></li>
									<li><a href="<%=path%>/T_goodsTypebianli">电脑</a></li>
									<li><a href="<%=path%>/T_goodsTypebianli">相机</a></li>
							
									
									
								</ul>
							</div>
						</div>
					<button type="submit" class="btn btn-info">查询</button> 
						
		<div>
	</form>
					
				</div>
			</div>
		</div>

		<!--以下显示表格-->
		<div class="container" style="margin-top:20px;">

			<table style="text-align: center;margin-right:10px;width:99%" class="table table-striped table-hover table-bordered">
				<thead style="text-align: center;">
					<tr >
				
						<th>序号</th>
						<th>商品名称</th>
						<th>商品价格</th>
						<th>图片</th>
						<th>上架时间</th>
						<th>商品描述</th>
						<th>编辑</th>
						<th>复选框</th>
						<th>删除</th>
						<th>删除</th>
						<th>编辑</th>
					</tr>
				</thead>
				<tbody>
					<tr>
					<c:forEach items="${list}" var="good">
	
					<tr>
					<!-- 	<td><input type="checkbox"/></td> -->
				<td>${good.id}</td>
				<td>${good.goodsName}</td>
				<td>${good.price}</td>
		 	   <%--  <td>${good.imgpath}</td>  --%>
				
				 <td><img src="http://localhost:8081/uploadfile/images/${good.imgpath}" class="img-rounded" height="50px" width="50px"/></td>  
				
				<td>${good.deployDate}</td>
				<td><button type="button" class="btn btn-primary" data-toggle="popover" data-placement="top" title="商品介绍" data-content="${good.description}">弹详情</button></td>
													<td>${good.typeld}</td>
 						<td><input type="checkbox" name="goodsid" value="${good.id}" ></td> 
		                  <td><a href="<%=path%>/delStu?goodsid=${good.id}">删除</a></td>
					<%-- 	<td>onclick="if(confirm('确定删除'+'${stu.stuname}'+'?')==false)return false">删除</a></td> --%>
							
							
							
							<td><a  href="<%=path%>/delStu?goodsid=${good.id}"onclick="if(confirm('是否删除'+'${good.id}'+'?')==false)return false" class="glyphicon glyphicon-trash" color="#5BC0DE"></a></td>
							
						
							
							
							
		
		
						<td><a href="<%=path%>/after/add_goods.jsp?id=${good.id}"><span class="glyphicon glyphicon-edit" color="#5BC0DE"></span></a></td>
		       
	
			</tr>
		
		</c:forEach>
     <tr >
 		<td colspan="3">一共有${dataCount}条数据，一共${pageCount}页，当前是${pageNo}页</td>
 	</tr>
 	<tr >
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
 		<td><a href="<%=path%>/zhumohu?pageNo=1">首页</a></td>
 		<td><a href="<%=path%>/zhumohu?pageNo=${pageNo-1}">上一页</a></td>
 		<%
 		}
 		if(pageNo<pageCount){
 		%>
 		<td><a href="<%=path%>/zhumohu?pageNo=${pageNo+1}">下一页</a></td>
 		<td><a href="<%=path%>/getAllByPage?pageNo=${pageCount}">尾页</a></td>
 		<%
 		}
 	%>
 	</tr>
 </table>
	</body>
</html>
