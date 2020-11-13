package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/checkName")
public class CheckStuNameRegister extends HttpServlet {
	//注册时不能有重复名字
	//去数据库添加一个索引，表示值不能重复
	//使用ajax在注册的时候验证信息，保证不能有重复值

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String stuName=req.getParameter("stuname");	
		String name="李四";
			if(stuName.equals(name)) {
				resp.getWriter().print(false);
			}else {
				resp.getWriter().print(true);
			}
	}
}
