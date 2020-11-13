package com.service.impl;

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
@WebServlet("/yonghulibiaogetAllByPage")
public class yonghuliebiaofenye extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
doPost(req, resp);
}@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//�������һ�ν��������������ʱ�� ��ʾ��Ӧ������һҳ�����ݣ�
	//ҳ�� ��������ҳ���ǰ��ҳ�洫���� 
	//���������������ȷ���ǰ��ҳ�� �����ȷ��ʿ�������
	T_userService  ss=new T_userServiceImpl();
	PageUtil pu=new PageUtil();
	String pNo=req.getParameter("pageNo");
	if(pNo==null){
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
	List<T_user> list=ss.getAllByPage(pageNo, pageSize);
	req.setAttribute("list", list);//��ʾ���ݵ�
	req.setAttribute("dataCount", dataCount);
	req.setAttribute("pageCount", pageCount);
	req.setAttribute("pageSize", pageSize);
	req.setAttribute("pageNo", pageNo);
	//ת��
	req.getRequestDispatcher("/after/user.jsp").forward(req, resp);
	//����϶���Ҫ��תҳ���  ����ת֮ǰ ������װ��  
}
	}



