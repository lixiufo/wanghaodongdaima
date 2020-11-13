package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.service.StuService;
import com.service.impl.StuServiceImpl;
import util.PageUtil;
@WebServlet("/getAllByPageFuzzy")
public class GetAllByPageFuzzy extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		StringBuffer condition=new StringBuffer();
		StuService ss=new StuServiceImpl();
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
		String stuname=request.getParameter("stuname");
		if(stuname!=null && !"".equals(stuname)) {
			condition.append( " and stuname like '%"+stuname+"%' " );
		}
		String gradename=request.getParameter("grade");
		if(gradename!=null && !"".equals(gradename)) {
			condition.append( " and grade.gname like '%"+gradename+"%' " );
		}
		System.out.println(condition);
		List<Student> list=ss.getStuAndGradeFuzzy(pageNo, pageSize, condition.toString());
		request.setAttribute("list", list);
		request.setAttribute("pageNo", pageNo);
		request.setAttribute("pageSize", pageSize);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("dataCount", dataCount);
		//大量的数据不要放在session内  session是放在服务器端的 
		request.getRequestDispatcher("/show.jsp").forward(request, response);
	}
	
}
