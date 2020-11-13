package com.service.impl;
import java.util.List;
import com.dao.HouseDao;
import com.dao.impl.HouseDaoImpl;
import com.entity.House;
import com.service.HouseService;

public class HouseServiceImpl implements HouseService {
	HouseDao  sd=new HouseDaoImpl();
	@Override
	public List<House> getAll() {

		return sd.getAll();
	}
	@Override
	public List<House> getAllByPage(int pageNo, int pageSize) {

		return sd.getAllByPage(pageNo, pageSize);
	}
	@Override
	public int getDataCount() {
	
		return sd.getDataCount();
	}
	@Override
	public int addHouse(House house) {

		return sd.addHouse(house);
	}

}
