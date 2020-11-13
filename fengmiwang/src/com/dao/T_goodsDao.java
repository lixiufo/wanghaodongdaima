package com.dao;

import java.util.List;


import com.entity.T_goods;

public interface T_goodsDao {
	public List<T_goods> getAll();//遍历
	public int delT_goodsById(int id);//删除
	public int updateById(T_goods goo);//修改
	public List<T_goods> getAllByPage(int pageNo,int pageSize);//分页
	public int getDataCoutn();//也是分页
	public List<T_goods> getGoodsFuzzy(int pageNo, int pageSize,String condition);//模糊查询
	public int addT_goods(T_goods goo);//增加
	public T_goods getgoodById(int id);//写一个类得到id


}
