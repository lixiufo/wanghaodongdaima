package com.dao;

import java.util.List;

import com.entity.T_goods;
import com.entity.T_user;

public interface T_userDao {
	public List<T_user> getAll();//����
	public int delT_userById(int id);//ɾ��
	public List<T_user> getAllByPage(int pageNo,int pageSize);//��ҳ
	public int getDataCoutn();
	public List<T_user> getuserFuzzy(int pageNo, int pageSize,String condition);//ģ����ѯ
}
