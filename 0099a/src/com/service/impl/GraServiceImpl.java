package com.service.impl;

import java.util.List;

import com.dao.GradeDao;
import com.dao.impl.GradeDaoImpl;
import com.entity.Grade;
import com.service.GraService;

public class GraServiceImpl implements GraService {
GradeDao sd=new GradeDaoImpl();
	@Override
	public boolean denglu(Grade gra) {

		return sd.denglu(gra);
	}
	@Override
	public List<Grade> getAllGra() {

		return sd.getAllGra();
	}

}
