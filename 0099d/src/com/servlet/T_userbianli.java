package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.T_goods;
import com.entity.T_user;
import com.service.T_goodsService;
import com.service.T_userService;
import com.service.impl.T_goodsServiceImpl;
import com.service.impl.T_userServiceImpl;
@WebServlet("/bianli1")
public class T_userbianli extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		T_userService ss=new T_userServiceImpl();
		List<T_user> list=ss.getAll();
		request.setAttribute("list",list);
		request.getRequestDispatcher("/after/user.jsp").forward(request,response);//×ª·¢
//		response.sendRedirect(location); 
	}

}
