package com.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TextCookie")
public class TextCookie extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
Cookie [] cookies=request.getCookies();
boolean flag=false;
Date date=null;
if(cookies!=null) {
	for (int i = 0; i < cookies.length; i++) {
		if(cookies[i].getName().equals("lastLogin")) {
			flag=true;
			date=new Date(System.currentTimeMillis());
			cookies[i].setValue(System.currentTimeMillis()+"");
		}
	}
}
if(flag) {
	response.getWriter().write("上一次的登录时间是"+date);
}else {
	response.getWriter().write("第一次的");
}
	Cookie cookie=new Cookie("lastLogin",System.currentTimeMillis()+"");
	cookie.setMaxAge(60*60*24);
	response.addCookie(cookie);
	
	
}
}
