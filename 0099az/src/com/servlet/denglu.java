package com.servlet;

import java.io.IOException;

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
@WebServlet("/denglu")
public class denglu extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String stuName=request.getParameter("stuName");
		String stuPwd=request.getParameter("stuPwd");
		Grade gra=new Grade();
		int k=Integer.valueOf(stuPwd);
		gra.setGname(stuName);
		gra.setGid(k);
		
		GraService ss=new GraServiceImpl();
		if(ss.denglu(gra)) {
//			request.getSession().setAttribute("stuname", gra.getGname());
//			System.out.println("登录成功");
		response.sendRedirect("/0099az/bianli");//此处少地址
		}else {
	response.getWriter().write("用户名或密码输入错误,请稍等几秒后登录好不好");
	response.setHeader("refresh", "10;/0099az/Text2.jsp");
		}
	}
	}


