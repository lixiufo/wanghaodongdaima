package com.servlet;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.House;
import com.service.HouseService;
import com.service.impl.HouseServiceImpl;
import util.PageUtil;
@WebServlet("/FenYeBianLi")
public class FenYeBianLi extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doPost(req, resp);
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HouseService  ss=new HouseServiceImpl();
		PageUtil pu=new PageUtil();
		String pNo=req.getParameter("pageNo");
		if(pNo==null){
			pNo="1";
		}
		int pageNo=Integer.parseInt(pNo);
		int pageSize=2;
		int dataCount=ss.getDataCount();
		pu.setPageSize(pageSize);
		pu.setPageNo(pageNo);
		pu.setDataCount(dataCount);

		int pageCount=pu.getPageCount();
		List<House> list=ss.getAllByPage(pageNo, pageSize);
		req.setAttribute("list", list);//显示数据的
		req.setAttribute("dataCount", dataCount);
		req.setAttribute("pageCount", pageCount);
		req.setAttribute("pageSize", pageSize);
		req.setAttribute("pageNo", pageNo);

		req.getRequestDispatcher("/show.jsp").forward(req, resp);

	}
		}
