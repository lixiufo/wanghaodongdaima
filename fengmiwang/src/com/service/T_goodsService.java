package com.service;

import java.util.List;

import com.entity.T_goods;

public interface T_goodsService {
	public List<T_goods> getAll();//����
	public int delT_goodsById(int id);//ɾ��
	public int updateById(T_goods goo);//�޸�
	public List<T_goods> getAllByPage(int pageNo,int pageSize);//��ҳ
	public int getDataCoutn();//Ҳ�Ƿ�ҳ
	public int addT_goods(T_goods goo);//����
	public List<T_goods> getGoodsFuzzy(int pageNo, int pageSize,String condition);//ģ����ѯ
	public T_goods getgoodById(int id);

}
