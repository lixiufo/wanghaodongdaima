package com.service.impl;

import com.dao.AdminDao;
import com.dao.impl.AdminDaoImpl;
import com.entity.Admin;
import com.service.AdmService;

public class AdminServiceImpl implements AdmService {
AdminDao sd= new AdminDaoImpl();
	@Override
	public boolean login(Admin adm) {
	
		return sd.login(adm);
	}

}
