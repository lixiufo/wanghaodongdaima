package com.service;

import java.util.List;

import com.entity.T_goodsType;

public interface T_goodsTypeService {
	public List<T_goodsType> getAll();//±éÀú
	public int addT_goodsType(T_goodsType goods);
	public int delT_goodsTypeById(int id);//É¾³ý
}
