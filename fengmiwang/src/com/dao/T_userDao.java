package com.dao;

import java.util.List;

import com.entity.T_goods;
import com.entity.T_user;

public interface T_userDao {
	public List<T_user> getAll();//遍历
	public int delT_userById(int id);//删除
	public List<T_user> getAllByPage(int pageNo,int pageSize);//分页
	public int getDataCoutn();
	public List<T_user> getuserFuzzy(int pageNo, int pageSize,String condition);//模糊查询
}
