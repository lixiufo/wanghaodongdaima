package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.service.StuService;
import com.service.impl.StudentServiceImpl;
@WebServlet("/loginServlet")
public class Text3 extends HttpServlet {
	
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              doPost(request, response);
}



@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String stuName= request.getParameter("stuName");
	String stuPwd =request.getParameter("stuPwd");
	System.out.println("³É¹¦");
	int k=Integer.valueOf(stuPwd);
	
	
	StuService ss=new StudentServiceImpl();
	Student stu =new Student();
	stu.setStuid(k);
	stu.setStuname(stuName);
	ss.selStu(stu);
	}
}
