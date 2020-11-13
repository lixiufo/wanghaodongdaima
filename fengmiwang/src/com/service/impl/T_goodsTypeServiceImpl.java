package com.service.impl;

import java.util.List;

import com.dao.T_goodsTypeDao;
import com.dao.impl.T_goodsTypeDaoImpl;
import com.entity.T_goodsType;
import com.service.T_goodsTypeService;

public class T_goodsTypeServiceImpl implements T_goodsTypeService {
	T_goodsTypeDao  sd=new T_goodsTypeDaoImpl();
	@Override
	public List<T_goodsType> getAll() {
	
		return sd.getAll();
	}
	@Override
	public int addT_goodsType(T_goodsType goods) {
	
		return sd.addT_goodsType(goods);
	}
	@Override
	public int delT_goodsTypeById(int id) {
	
		return sd.delT_goodsTypeById(id);
	}

}
