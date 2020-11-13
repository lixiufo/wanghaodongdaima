package com.dao;

import java.util.List;

import com.entity.House;


public interface HouseDao {
	public List<House> getAll();//±éÀú
	public List<House> getAllByPage(int pageNo,int pageSize);//·ÖÒ³
	public int getDataCount();//·ÖÒ³
	public int addHouse(House house);
}
