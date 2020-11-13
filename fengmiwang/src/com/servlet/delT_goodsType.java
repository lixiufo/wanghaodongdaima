package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.T_goodsTypeService;
import com.service.impl.T_goodsTypeServiceImpl;
@WebServlet("/delT_goodsType")
public class delT_goodsType extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	doPost(request, response);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	T_goodsTypeService ss=new T_goodsTypeServiceImpl(); 
	String str=request.getParameter("id");
	int id=Integer.parseInt(str);
	int result=ss.delT_goodsTypeById(id);
	if(result>0) {
		response.sendRedirect("/fengmiwang/T_goodsTypebianli");
}
	}
	}

