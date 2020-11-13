package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.entity.T_goods;
import com.service.T_goodsService;
import com.service.impl.T_goodsServiceImpl;
@WebServlet("/bianli")
public class T_goodsbianli extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	T_goodsService ss=new T_goodsServiceImpl();
	List<T_goods> list=ss.getAll();
	request.setAttribute("list",list);
	request.getRequestDispatcher("/after/goods_list.jsp").forward(request,response);//×ª·¢
//	response.sendRedirect(location);   

	}
}
