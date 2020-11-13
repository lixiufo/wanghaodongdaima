package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.GradeDao;
import com.entity.Grade;
import com.entity.Student;

import util.BaseDao;

public class GradeDaoImpl extends BaseDao implements GradeDao{

	@Override
	public boolean denglu(Grade gra) {
		String sql ="select * from grade where gid=? and gname=? ";
		Object [] obj = {gra.getGid(),gra.getGname()};
	ResultSet rs=this.chazhao(sql, obj);
	boolean flag=false;
	try {
		while(rs.next()) {
			flag=(true);
		}
		
	} catch (SQLException e) {

		e.printStackTrace();
	}
	
	return flag;
	}

	@Override
	public List<Grade> getAllGra() {
		String sql="select*from grade";
		Object [] obj= {};
		ResultSet rs=this.chazhao(sql, obj);
		List<Grade> list=new ArrayList<Grade>();
		try {
			while(rs.next()) {
				Grade gra=new Grade();
				gra.setGid(rs.getInt(1));
				gra.setGname(rs.getString(2));
			
				list.add(gra);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return list;
		}
	}
	

