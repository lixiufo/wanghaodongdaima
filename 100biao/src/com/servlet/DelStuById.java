package com.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.service.StuService;
import com.service.impl.StuServiceImpl;
@WebServlet("/delStu")
public class DelStuById extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doPost(req, resp);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	StuService ss=new StuServiceImpl();
	String stuids=request.getParameter("stuids");
String [] strIds =stuids.split(",");
int result=0;
  for (int i = 0; i < strIds.length; i++) {
	if (!(strIds[i].equals("") )) {
		int id =Integer.parseInt(strIds[i]);
		ss.delStuById(id);
	}
	result++;
  }
  if (result==strIds.length ) {
	response.sendRedirect("/0099a/getAllByPage");
}
	}
	}

