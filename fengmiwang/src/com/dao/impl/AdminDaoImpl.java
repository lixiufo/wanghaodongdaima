package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.AdminDao;
import com.entity.Admin;

import util.BaseDao;

public class AdminDaoImpl extends BaseDao implements AdminDao{

	@Override
	public boolean login(Admin adm) {
		String sql ="select * from admin where username=? and password=? ";
		Object [] obj = {adm.getUsername(),adm.getPassword()};
	ResultSet rs=this.chazhao(sql, obj);
	boolean flag=false;
	try {
		while(rs.next()) {
			flag=(true);
		}
		
	} catch (SQLException e) {

		e.printStackTrace();
	}
	this.closeResource();
	return flag;
	}
	}
