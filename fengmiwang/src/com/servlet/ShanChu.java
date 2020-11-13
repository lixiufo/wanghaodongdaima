package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.service.T_goodsService;

import com.service.impl.T_goodsServiceImpl;
@WebServlet("/delStu")
public class ShanChu extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	T_goodsService ss=new T_goodsServiceImpl();
//	String str=request.getParameter("goodsid");
//	int stuid=Integer.parseInt(str);
//	int result=ss.delT_goodsById(stuid);
//	if(result>0) {
//		response.sendRedirect("/fengmiwang/bianli");
		
		String str=request.getParameter("goodsid");
		String [] strIds =str.split(",");
		int result=0;
		for (int i = 0; i < strIds.length; i++) {
		if (!(strIds[i].equals("") )) {
			int id =Integer.parseInt(strIds[i]);
			ss.delT_goodsById(id);
		}
		result++;
	  }
	  if (result==strIds.length ) {
		response.sendRedirect("/fengmiwang/zhumohu");
	}
		}
		}
		
		
	



