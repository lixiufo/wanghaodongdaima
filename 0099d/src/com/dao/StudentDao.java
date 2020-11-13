package com.dao;

import java.util.List;

import com.entity.Student;

public interface StudentDao {
	public boolean  login(Student stu);//��¼
	public List<Student> getAllStu();//����
	public int delStuById(int stuid);//ɾ��
	public Student getStuById(int stuid);//�޸�
	public int updateStuById(Student stu);
	
	//��ҳ��Ҫ�Ĳ���  һ��ҳ��    һ��ÿҳ��ʾ������
	public List<Student> getAllByPage(int pageNo,int pageSize);//��ҳ
	
	//����ܹ�����������
	public int getDataCount();//��ҳ
	
	
	public int addStu(Student stu);
	//���ӱ�
	public List<Student>  getStuAndGradeName(int pageNo, int pageSize);
//����Ҫ�з�ҳ����Ҫ��ģ����ѯ������ģ����ѯ���Ǳ����е�
	//�������һ������  �������� condition  ��������ַ���  ��ƴ�ӵ�
	public List<Student> getStuAndGradeFuzzy(int pageNo, int pageSize,String condition);
	
	//��ѯ���ݿ������Ƿ��ظ�
	public boolean chaxunmingzichongfu(Student stu);
	
	
}
