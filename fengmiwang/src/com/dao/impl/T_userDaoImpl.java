package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.T_userDao;
import com.entity.T_goods;
import com.entity.T_goodsType;
import com.entity.T_user;

import util.BaseDao;

public class T_userDaoImpl extends BaseDao implements T_userDao{

	@Override
	public List<T_user> getAll() {//遍历
		String sql="select*from t_user";
		Object [] obj= {};
		ResultSet rs=this.chazhao(sql, obj);
		List<T_user> list=new ArrayList<T_user>();
		try {
			while(rs.next()) {
				T_user stu=new T_user();
				stu.setId(rs.getInt(1));
				stu.setUsername(rs.getString(2));
				stu.setPassword(rs.getString(3));
				stu.setPhone(rs.getString(4));
				stu.setMail(rs.getString(5));
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.closeResource();
			return list;
		}

	@Override
	public int delT_userById(int id) {
		String sql="delete from T_user where id =?";
		Object [] obj= {id};
		this.closeResource();
		return this.zengshanggai(sql, obj);
}

	@Override
	public List<T_user> getAllByPage(int pageNo, int pageSize) {
		String sql="select * from t_user limit ?,?";
		//当前页码 -1  * 页容量   
		//第一页  显示5条数据  ?,?  0 2   第一页
		//显示第三条和第四条	2 2	第二页
		//显示第五条 第六条    4  2	第三页
		//显示第七条 第八条  6  2	第四页
		Object [] obj= {(pageNo-1)*pageSize,pageSize};
		ResultSet rs=this.chazhao(sql, obj);
		List<T_user> list=new ArrayList<T_user>();
		try {
			while(rs.next()) {
				T_user u=new T_user();
				u.setId(rs.getInt(1));	
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setPhone(rs.getString(4));
				u.setMail(rs.getString(5));
				list.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeResource();
		return list;
	}

	@Override
	public int getDataCoutn() {
		String sql="select count(1) from t_user";
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
		this.closeResource();
		return count;
	}

	@Override
	public List<T_user> getuserFuzzy(int pageNo, int pageSize, String condition) {
		String sql="select *  from t_user  "+condition+" limit ?,?";
		Object [] obj= {(pageNo-1)*pageSize,pageSize};
		ResultSet rs=this.chazhao(sql, obj);
		List<T_user> list=new ArrayList<T_user>();
		try {
			while(rs.next()) {
				T_user user=new T_user();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setMail(rs.getString("mail"));
				
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeResource();
		return list;
	}
	}





