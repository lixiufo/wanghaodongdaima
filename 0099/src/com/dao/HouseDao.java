package com.dao;

import java.util.List;

import com.entity.House;


public interface HouseDao {
	public List<House> getAll();//����
	public List<House> getAllByPage(int pageNo,int pageSize);//��ҳ
	public int getDataCount();//��ҳ
	public int addHouse(House house);
}
