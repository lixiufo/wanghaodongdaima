package com.service;

import java.util.List;

import com.entity.Student;

public interface StuService {
	public int addStu(Student stu );
	public int updateStuById();
	public int delStuById();
	void selStu(Student stu);
	public List<Student>getAll();
	public boolean delGradeByGid(int gid);
}
