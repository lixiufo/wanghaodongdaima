package com.service.impl;

import java.util.List;

import com.dao.GradeDao;
import com.dao.StudentDao;
import com.dao.impl.GradeDaoImpl;
import com.dao.impl.StudentDaoImpl;
import com.entity.Grade;
import com.entity.Student;
import com.service.StuService;

public class StudentServiceImpl implements StuService {

	StudentDao sd=new StudentDaoImpl();
	GradeDao gd=new GradeDaoImpl();
	
	@Override
	public int addStu(Student stu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStuById() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delStuById() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delGradeByGid(int gid) {
	Student stu=new Student();
	stu.setGradeid(gid);
	
	if(sd.getStuCountByGid(stu)==0) {
		Grade grade=new Grade();
		grade.setGid(gid);
		gd.delGradeById(grade);
		System.out.println("删除成功");
		return true;
	}else {
		System.out.println("当前班级还有人不能删除班级信息");
	}
	return false;
}

	@Override
	public void selStu(Student stu) {
		sd.selStu(stu);
		
	}
}
