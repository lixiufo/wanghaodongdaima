package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.T_goods;
import com.entity.T_goodsType;
import com.service.T_goodsService;
import com.service.T_goodsTypeService;
import com.service.impl.T_goodsServiceImpl;
import com.service.impl.T_goodsTypeServiceImpl;
@WebServlet("/T_goodsTypebianli")
public class T_goodsTypeBianLi extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	doPost(request, response);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	T_goodsTypeService ss=new T_goodsTypeServiceImpl();
	List<T_goodsType> list=ss.getAll();
	request.setAttribute("list",list);
	request.getRequestDispatcher("/after/goods_type_list.jsp").forward(request,response);//×ª·¢
//	response.sendRedirect(location);  
	}
}
