package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Text2 extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("Test2��������ʼ����������������������������������");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Test2 �Ӵ�");
	}
	
	@Override
	public void destroy() {
		System.out.println("����");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse  response) throws ServletException, IOException {
		System.out.println("get����");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post����");
	}

	
	
	
}