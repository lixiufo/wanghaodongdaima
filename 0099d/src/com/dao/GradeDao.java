package com.dao;

import java.util.List;

import com.entity.Grade;
import com.entity.Student;

public interface GradeDao {
	public boolean  denglu(Grade gra);//��¼
	public List<Grade> getAllGra();//����
}
