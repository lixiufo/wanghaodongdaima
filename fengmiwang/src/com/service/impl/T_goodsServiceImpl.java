package com.service.impl;

import java.util.List;

import com.dao.T_goodsDao;
import com.dao.impl.T_goodsDaoImpl;
import com.entity.T_goods;
import com.service.T_goodsService;

public class T_goodsServiceImpl implements T_goodsService {
T_goodsDao sd=new T_goodsDaoImpl();
	@Override
	public List<T_goods> getAll() {

		return sd.getAll();
	}
	@Override
	public int delT_goodsById(int id) {

		return sd.delT_goodsById(id);
	}
	@Override
	public int updateById(T_goods goo) {
		// TODO Auto-generated method stub
		return sd.updateById(goo);
	}
	@Override
	public List<T_goods> getAllByPage(int pageNo, int pageSize) {				//·ÖÒ³

	return sd.getAllByPage(pageNo, pageSize);
	}
	@Override
	public int getDataCoutn() {
		return sd.getDataCoutn();
	}
	@Override
	public int addT_goods(T_goods goo) {
	
		return sd.addT_goods(goo);
	}
	@Override
	public List<T_goods> getGoodsFuzzy(int pageNo, int pageSize, String condition) {
	
		return sd.getGoodsFuzzy(pageNo, pageSize, condition);
	}
	@Override
	public T_goods getgoodById(int id) {
		// TODO Auto-generated method stub
		return sd.getgoodById(id);
	}
}
