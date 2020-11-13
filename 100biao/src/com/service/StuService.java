package com.service;

import java.util.List;

import com.entity.Student;

public interface StuService {
public boolean login(Student stu);
public List<Student> getAllStu();
public int delStuById(int stuid);
public Student getStuById(int stuid);
public int updateStuById(Student stu);


//��ҳ
public List<Student> getAllByPage(int pageNo, int pageSize);
//�õ��ܹ���ҳ��
public int getDataCoutn();

public int addStu(Student stu);
//���ӱ�
public List<Student>  getStuAndGradeName(int pageNo, int pageSize);
//ģ����ѯ
public List<Student> getStuAndGradeFuzzy(int pageNo, int pageSize,String condition);


//��ѯ�����ظ�����
public boolean chaxunmingzichongfu(Student stu);
}
