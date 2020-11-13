package com.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.text.ParseException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.entity.T_goods;
import com.entity.T_goodsType;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.service.T_goodsService;
import com.service.T_goodsTypeService;
import com.service.impl.T_goodsServiceImpl;
import com.service.impl.T_goodsTypeServiceImpl;
@WebServlet("/updateOrAddT_goods")
@MultipartConfig
public class UpdateGoods extends HttpServlet {//修改和增加的
	
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	String id=request.getParameter("id");
	String goodsName=request.getParameter("goodsName");
	System.out.println(goodsName);
	String price=request.getParameter("price");
	int rice=Integer.parseInt(price);

	String imgPath=request.getParameter("imgPath");
	Part part=request.getPart("imgPath");
	String img=part.getSubmittedFileName();
	img=UUID.randomUUID().toString()+img;
	part.write("D:\\Tomcat\\apache-tomcat-8.5.43\\webapps\\uploadfile\\images\\"+img);
	//
	Date a=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");
	String deployDate = sdf.format(a);
	Date date=null;
	
	try {
		date=sdf.parse(deployDate);
	} catch (ParseException e) {
		e.printStackTrace();
	}

	
	
	

	String description=request.getParameter("description");
	String typeId=request.getParameter("typeId");
	int peId=Integer.parseInt(typeId);
	T_goods good=new T_goods();
	T_goodsService ss=new T_goodsServiceImpl();


	good.setGoodsName(goodsName);
	good.setPrice(rice);
	good.setImgpath(img);
	System.out.println(img);

	good.setDescription(description);

	int result=0;
	if(!(id.equals(""))) {
		int sid=Integer.parseInt(id);
		good.setId(sid);
		result=ss.updateById(good);
	}else {
		result=ss.addT_goods(good);
	}
	if(result>0) {
		response.sendRedirect("/fengmiwang/getAllByPage");
	}
	
}
	}

