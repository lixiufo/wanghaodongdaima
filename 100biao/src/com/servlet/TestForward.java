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
@WebServlet("/Text")
public class TestForward extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request,response);
	}
	
	
	
	
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.setCharacterEncoding("UTF-8");
	String stuName=request.getParameter("stuName");
	String stuPwd=request.getParameter("stuPwd");
	Student stu=new Student();
	stu.setStuname(stuName);
	int k=Integer.valueOf(stuPwd);
	stu.setStuid(k);
	StuService ss=new StuServiceImpl();
	if(ss.login(stu)) {
	
		request.getSession().setAttribute("stuName", stu.getStuname());
		response.sendRedirect("/0099a/success.jsp");         //÷ÿ∂®œÚ
	
	}else {
System.out.println("fsdfsdf");
	}
}
	}


