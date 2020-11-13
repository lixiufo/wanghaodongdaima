package com.service.impl;

import java.util.List;

import com.dao.StudentDao;
import com.dao.impl.StudentDaoImpl;
import com.entity.Student;
import com.service.StuService;

public class StuServiceImpl implements StuService {
StudentDao  sd= new StudentDaoImpl();
	@Override
	public boolean login(Student stu) {
		
		return sd.login(stu);
	}
	@Override
	public List<Student> getAllStu() {
	
		return sd.getAllStu();
	}
	@Override
	public int delStuById(int stuid) {

		return sd.delStuById(stuid);
	}
	@Override
	public Student getStuById(int stuid) {

		return sd.getStuById(stuid);
	}
	@Override
	public int updateStuById(Student stu) {
		return sd.updateStuById(stu);
	
	}
	@Override
	public List<Student> getAllByPage(int pageNo, int pageSize) {

		return sd.getAllByPage(pageNo, pageSize);
	}
	@Override
	public int getDataCoutn() {
		
		return sd.getDataCount();
	}
	@Override
	public int addStu(Student stu) {

		return sd.addStu(stu);
	}
	@Override
	public List<Student> getStuAndGradeName(int pageNo, int pageSize) {
		return sd.getStuAndGradeName(pageNo, pageSize);
	}
	@Override
	public List<Student> getStuAndGradeFuzzy(int pageNo, int pageSize, String condition) {
		return sd.getStuAndGradeFuzzy(pageNo, pageSize, condition);
	}
	@Override
	public boolean chaxunmingzichongfu(Student stu) {
		// TODO Auto-generated method stub
		return sd.chaxunmingzichongfu(stu);
	}


}
