package com.dao;

import java.util.List;


import com.entity.T_goods;

public interface T_goodsDao {
	public List<T_goods> getAll();//����
	public int delT_goodsById(int id);//ɾ��
	public int updateById(T_goods goo);//�޸�
	public List<T_goods> getAllByPage(int pageNo,int pageSize);//��ҳ
	public int getDataCoutn();//Ҳ�Ƿ�ҳ
	public List<T_goods> getGoodsFuzzy(int pageNo, int pageSize,String condition);//ģ����ѯ
	public int addT_goods(T_goods goo);//����
	public T_goods getgoodById(int id);//дһ����õ�id


}
