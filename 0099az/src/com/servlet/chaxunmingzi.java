package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.service.StuService;
import com.service.impl.StuServiceImpl;
@WebServlet("/chongfumingzi")
public class chaxunmingzi extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          String StuName=request.getParameter("stuname");
          StuService ss=new StuServiceImpl();
          Student stu=new Student();
          stu.setStuname(StuName);
	if(ss.chaxunmingzichongfu(stu)) {
		response.getWriter().print(false);
	}else {
		response.getWriter().print(true);
	}
	}
}
