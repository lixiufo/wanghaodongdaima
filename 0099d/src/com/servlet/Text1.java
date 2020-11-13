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


@WebServlet("/Text1")
public class Text1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost (request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String stuName=request.getParameter("stuName");
		String stuPwd=request.getParameter("stuPwd");
		Student stu=new Student();
		int k=Integer.valueOf(stuPwd);
		stu.setStuname(stuName);
		stu.setStuid(k);
		
		StuService ss=new StuServiceImpl();
		if(ss.login(stu)) {
			request.getSession().setAttribute("stuname", stu.getStuname());
			response.sendRedirect("/0099a/getAllByPageFuzzy");
		}else {
	response.getWriter().write("用户名或密码输入错误,请稍等几秒后登录好不好");
	response.setHeader("refresh", "10;/0099a/Text2.jsp");
		}
	}
}
