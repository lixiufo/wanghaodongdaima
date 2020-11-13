package com.service;

import java.util.List;

import com.entity.Student;

public interface StuService {
public boolean login(Student stu);
public List<Student> getAllStu();
public int delStuById(int stuid);
public Student getStuById(int stuid);
public int updateStuById(Student stu);


//分页
public List<Student> getAllByPage(int pageNo, int pageSize);
//得到总共的页数
public int getDataCoutn();

public int addStu(Student stu);
//连接表
public List<Student>  getStuAndGradeName(int pageNo, int pageSize);
//模糊查询
public List<Student> getStuAndGradeFuzzy(int pageNo, int pageSize,String condition);


//查询名字重复后不让
public boolean chaxunmingzichongfu(Student stu);
}
