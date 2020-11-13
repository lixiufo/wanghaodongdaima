package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.service.StuService;
import com.service.impl.StuServiceImpl;

/**
 * Servlet implementation class showStuServlet
 */
@WebServlet("/getAll")
public class showStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doPost(req, resp);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StuService ss=new StuServiceImpl();
		List<Student> list=ss.getAllStu();
		request.setAttribute("list",list);
		request.getRequestDispatcher("/show.jsp").forward(request,response);//转发
//		response.sendRedirect(location);        //重定向
	}

}
