package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.T_goods;
import com.service.T_goodsService;
import com.service.impl.T_goodsServiceImpl;

import util.PageUtil;
@WebServlet("/zhumohu")
public class zhumohu extends HttpServlet{
	private static final long serialVersionUID = 1L;
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

doPost(request, response);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	StringBuffer condition=new StringBuffer();
	T_goodsService ss=new T_goodsServiceImpl();
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
	String goodsName=request.getParameter("goodsName");
	if(goodsName!=null && !"".equals(goodsName)) {
		condition.append(" and goodsName like '%"+goodsName+"%' ");
	}
	
//	String typename=request.getParameter("typename");
//	if(typename!=null && !"".equals(typename)) {
//		condition.append(" and grade.gname like '%"+typename+"%'");
//	}
	
	List<T_goods> list=ss.getGoodsFuzzy(pageNo, pageSize, condition.toString());
//	System.out.println(list.size());
	request.setAttribute("list", list);
	request.setAttribute("pageNo", pageNo);
	request.setAttribute("pageSize", pageSize);
	request.setAttribute("pageCount", pageCount);
	request.setAttribute("dataCount", dataCount);
	//���������ݲ�Ҫ����session��  session�Ƿ��ڷ������˵� 
	request.getRequestDispatcher("/after/goods_list.jsp").forward(request, response);
	}
}
