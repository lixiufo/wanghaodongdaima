package com.service.impl;

import java.util.List;
import com.dao.T_userDao;
import com.dao.impl.T_userDaoImpl;
import com.entity.T_user;
import com.service.T_userService;

public class T_userServiceImpl implements T_userService {
	T_userDao sd=new T_userDaoImpl();
	@Override
	public List<T_user> getAll() {
	
		return sd.getAll() ;
	}
	@Override
	public int delT_userById(int id) {

		return sd.delT_userById(id);
	}
	@Override
	public List<T_user> getAllByPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return sd.getAllByPage(pageNo, pageSize);
	}
	@Override
	public int getDataCoutn() {
		// TODO Auto-generated method stub
		return sd.getDataCoutn();
	}
	@Override
	public List<T_user> getuserFuzzy(int pageNo, int pageSize, String condition) {

		return sd.getuserFuzzy(pageNo, pageSize, condition) ;
	}

}
