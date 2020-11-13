package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SessionAndCookie")
public class SessionAndCookie extends HttpServlet {
	Cookie cookie=null;
	
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost( request, response);
}
@Override
	protected void doPost(HttpServletRequest  request, HttpServletResponse response) throws ServletException, IOException {
	 
	
	System.out.println("最大存活时间是"+request.getSession().getMaxInactiveInterval());  
	 request.getSession().setAttribute("name", "金国领");
	 System.out.println(request.getSession().getId());
		Cookie[] cookies=request.getCookies();
	 if(cookie==null) {
		 if(cookies!=null) {
			 for (int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("JSESSIONID"));{
					cookie=cookies[i];
				}
			}
		 }
	 }
	 cookie.setMaxAge(30);
	 response.addCookie(cookie);
	 response.sendRedirect("/0099az/NewFile.jsp");
	}

}
