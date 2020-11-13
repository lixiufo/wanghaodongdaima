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

import com.entity.House;
import com.service.HouseService;
import com.service.impl.HouseServiceImpl;

//import java.io.IOException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.entity.House;
//import com.service.HouseService;
//import com.service.impl.HouseServiceImpl;
@WebServlet("/tijiaofangyuan")
public class UpdateAdd extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

doPost(request, response);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	String id=request.getParameter("id");
//	String description=request.getParameter("description");
//	String housetype=request.getParameter("housetype");
//	//int sage=Integer.parseInt(stuage);		
//	String money=request.getParameter("money");
//	House s=new House();
//	HouseService ss=new HouseServiceImpl();
//	s.setDescription(description);
//	s.setHousetype(housetype);
//    s.setMoney(money);
//	int result=0;
//	if(!(id.equals(""))) {
//		int sid=Integer.parseInt(id);
//		s.setId(sid);
//		result=ss.addHouse(s);
//	}else {
//		result=ss.addHouse(s);;
//	}
//	if(result>0) {
//		response.sendRedirect("/0099/FenYeBianLi");
//	}}}
//	String id=request.getParameter("id");

	String description=request.getParameter("description");
	String housetype=request.getParameter("housetype");
//	int thousetype=Integer.parseInt(housetype);
	String money=request.getParameter("money");
//	String time=request.getParameter("time");
	Date a=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");
	String time = sdf.format(a);
	Date date=null;
	
	try {
		date=sdf.parse(time);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	java.sql.Date sdate=new java.sql.Date(date.getTime());
	House s=new House();
	HouseService hs=new HouseServiceImpl();
//	s.setId(tid);
	s.setDescription(description);
	s.setHousetype(housetype);
	s.setHousetype(housetype);
	s.setMoney(money);
	s.setTime(sdate);
	if(hs.addHouse(s)>0) {
		response.sendRedirect("/0099a/FenYeBianLi");
	}
}
}

