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
	//int pageNo=1; 每页显示的数据是由页码来决定的 所以不能写死 
	//要由前端传入   
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
	//因为当我们的总数据条数和每页显示的数据条数获取到以后
	//我们的总页数就有了 所以不能直接set  
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
	//大量的数据不要放在session内  session是放在服务器端的 
	request.getRequestDispatcher("/after/goods_list.jsp").forward(request, response);
	}
}
