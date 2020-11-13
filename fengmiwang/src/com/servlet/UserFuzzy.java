package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.T_user;
import com.service.T_userService;
import com.service.impl.T_userServiceImpl;

import util.PageUtil;
@WebServlet("/userFuzzy")
public class UserFuzzy extends HttpServlet{
	private static final long serialVersionUID = 1L;
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
}@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	StringBuffer condition=new StringBuffer();
	T_userService ss=new T_userServiceImpl();
	PageUtil pu=new PageUtil();
	//int pageNo=1; ÿҳ��ʾ����������ҳ���������� ���Բ���д�� 
	//Ҫ��ǰ�˴���   
	String pNo=request.getParameter("pageNo");
	if(pNo==null) {
		pNo="1";
	}
	int pageNo=Integer.parseInt(pNo);
	int pageSize=2;
	int dataCount=ss.getDataCoutn();
	pu.setPageSize(pageSize);
	pu.setPageNo(pageNo);
	pu.setDataCount(dataCount);
	//��Ϊ�����ǵ�������������ÿҳ��ʾ������������ȡ���Ժ�
	//���ǵ���ҳ�������� ���Բ���ֱ��set  
	int pageCount=pu.getPageCount();
	String username=request.getParameter("username");
	if(username!=null && !"".equals(username)) {
		condition.append(" where username like '%"+username+"%' ");
	}
	
	List<T_user> list=ss.getuserFuzzy(pageNo, pageSize, condition.toString());
	request.setAttribute("list", list);
	request.setAttribute("pageNo", pageNo);
	request.setAttribute("pageSize", pageSize);
	request.setAttribute("pageCount", pageCount);
	request.setAttribute("dataCount", dataCount);
	//���������ݲ�Ҫ����session��  session�Ƿ��ڷ������˵� 
	request.getRequestDispatcher("/after/user.jsp").forward(request, response);
	}

	}

