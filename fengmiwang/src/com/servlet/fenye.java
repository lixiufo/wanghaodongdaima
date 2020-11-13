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
@WebServlet("/getAllByPage")
public class fenye extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	doPost(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//当请求第一次进入这个控制器的时候 显示的应该是那一页的数据？
	//页码 从哪来？页码从前端页面传进来 
	//但是我们请求是先访问前端页面 还是先访问控制器？
	T_goodsService  ss=new T_goodsServiceImpl();
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
	//因为当我们的总数据条数和每页显示的数据条数获取到以后
	//我们的总页数就有了 所以不能直接set  
	int pageCount=pu.getPageCount();
	List<T_goods> list=ss.getAllByPage(pageNo, pageSize);
	req.setAttribute("list", list);//显示数据的
	req.setAttribute("dataCount", dataCount);
	req.setAttribute("pageCount", pageCount);
	req.setAttribute("pageSize", pageSize);
	req.setAttribute("pageNo", pageNo);
	//转发
	req.getRequestDispatcher("/after/goods_list.jsp").forward(req, resp);
	//这里肯定是要跳转页面的  在跳转之前 必须先装车  
}
	}
