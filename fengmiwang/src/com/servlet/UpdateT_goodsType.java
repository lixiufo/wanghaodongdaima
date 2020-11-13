package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.T_goodsType;
import com.service.T_goodsTypeService;
import com.service.impl.T_goodsTypeServiceImpl;
@WebServlet("/zengjia")
public class UpdateT_goodsType extends HttpServlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	doPost(request, response);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id=request.getParameter("id");
	String typename=request.getParameter("typename");

	T_goodsType goods=new T_goodsType ();
	T_goodsTypeService ss=new T_goodsTypeServiceImpl();
	goods.setTypename(typename);
	
	int result=0;
	if(!(id.equals(""))) {
		int sid=Integer.parseInt(id);
		goods.setId(sid);
		result=ss.addT_goodsType(goods);
	}else {
		result=ss.addT_goodsType(goods);
	}
	if(result>0) {
		response.sendRedirect("/fengmiwang/T_goodsTypebianli");
	}
	
	}
}
