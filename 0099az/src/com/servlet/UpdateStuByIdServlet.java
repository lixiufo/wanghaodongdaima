package com.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.service.StuService;
import com.service.impl.StuServiceImpl;
@WebServlet("/UpdateOrAddStu")
public class UpdateStuByIdServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doPost(req, resp);
	}
	
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String stuid=request.getParameter("stuid");
	String stuname=request.getParameter("stuname");
	String stuage=request.getParameter("stuage");
	int sage=Integer.parseInt(stuage);		
	String stubir=request.getParameter("stubir");
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	Date date=null;
	try {
		date=sdf.parse(stubir);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	java.sql.Date sdate=new java.sql.Date(date.getTime());
	String gradeid=request.getParameter("gradeid");
	int gid=Integer.parseInt(gradeid);
	Student stu=new Student();
	StuService ss=new StuServiceImpl();
	stu.setStuname(stuname);
	stu.setStuage(sage);
	stu.setStubir(sdate);
	stu.setGradeid(gid);
	int result=0;
	if(!(stuid.equals(""))) {
		int sid=Integer.parseInt(stuid);
		stu.setStuid(sid);
		result=ss.updateStuById(stu);
	}else {
		result=ss.addStu(stu);
	}
	if(result>0) {
		response.sendRedirect("/0099az/getAllByPage");
	}
	
}
}

