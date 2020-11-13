package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Admin;

import com.service.AdmService;
import com.service.impl.AdminServiceImpl;
@WebServlet("/login")
public class AdmLogin extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String Name=request.getParameter("username");
		String Pwd=request.getParameter("password");
		Admin adm=new Admin();

		adm.setUsername(Name);
		adm.setPassword(Pwd);
		
		AdmService ss=new AdminServiceImpl();
		if(ss.login(adm)) {
//			System.out.println("登录成功");
//			request.getSession().setAttribute("stuname", stu.getStuname());
			response.sendRedirect("/fengmiwang/zhumohu");
		}else {
	response.getWriter().write("用户名或密码输入错误,请稍等几秒后登录好不好");

		}
	}
	}


