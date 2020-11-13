package com.service;

import java.util.List;

import com.entity.House;

public interface HouseService {
	public List<House> getAll();//����
	public List<House> getAllByPage(int pageNo,int pageSize);//��ҳ
	public int getDataCount();//��ҳ
	public int addHouse(House house);
}
