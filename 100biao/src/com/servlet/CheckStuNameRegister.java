package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/checkName")
public class CheckStuNameRegister extends HttpServlet {
	//ע��ʱ�������ظ�����
	//ȥ���ݿ����һ����������ʾֵ�����ظ�
	//ʹ��ajax��ע���ʱ����֤��Ϣ����֤�������ظ�ֵ

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String stuName=req.getParameter("stuname");	
		String name="����";
			if(stuName.equals(name)) {
				resp.getWriter().print(false);
			}else {
				resp.getWriter().print(true);
			}
	}
}
