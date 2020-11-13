package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.HouseDao;
import com.entity.House;


import util.BaseDao;

public class HouseDaoImpl extends BaseDao implements HouseDao {

	@Override
	public List<House> getAll() {
		String sql="select*from house";
		Object [] obj= {};
		ResultSet rs=this.chazhao(sql, obj);
		List<House> list=new ArrayList<House>();
		try {
			while(rs.next()) {
				House a=new House();
				a.setId(rs.getInt(1));
				a.setDescription(rs.getString(2));
				a.setHousetype(rs.getString(3));
				a.setMoney(rs.getString(4));
				a.setTime(rs.getDate(5));
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return list;
		}

	@Override
	public List<House> getAllByPage(int pageNo, int pageSize) {
		String sql="select * from house  ORDER BY id desc limit ?,?";
		Object [] obj= {(pageNo-1)*pageSize,pageSize};
		ResultSet rs=this.chazhao(sql, obj);
		List<House> list=new ArrayList<House>();
		try {
			while(rs.next()) {
				House a=new House();
				a.setId(rs.getInt(1));
				a.setDescription(rs.getString(2));
				a.setHousetype(rs.getString(3));
				a.setMoney(rs.getString(4));
				a.setTime(rs.getDate(5));
				list.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;	
	}

	@Override
	public int getDataCount() {
		String sql="select count(1) from house";
		Object [] obj= {};
		ResultSet rs=this.chazhao(sql, obj);
		int count=0;
		try {
			while(rs.next()) {
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int addHouse(House house) {
		String sql="insert into house(description,housetype,money,time)values(?,?,?,?)";
		Object [] obj= {house.getDescription(),house.getHousetype(),house.getMoney(),house.getTime()};
		return this.zengshanggai(sql, obj);
	}

	}


