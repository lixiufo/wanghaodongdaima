package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Grade;
import com.entity.Student;
import com.service.GraService;
import com.service.StuService;
import com.service.impl.GraServiceImpl;
import com.service.impl.StuServiceImpl;
@WebServlet("/bianli")
public class showGraServlet2 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	doPost(request, response);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	GraService ss=new GraServiceImpl();
	List<Grade> list=ss.getAllGra();
	request.setAttribute("list",list);
	request.getRequestDispatcher("/show2.jsp").forward(request,response);//转发
//	response.sendRedirect(location);        //重定向
	}
}
