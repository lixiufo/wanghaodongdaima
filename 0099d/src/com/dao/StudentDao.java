package com.dao;

import java.util.List;

import com.entity.Student;

public interface StudentDao {
	public boolean  login(Student stu);//登录
	public List<Student> getAllStu();//遍历
	public int delStuById(int stuid);//删除
	public Student getStuById(int stuid);//修改
	public int updateStuById(Student stu);
	
	//分页需要的参数  一个页码    一个每页显示的数据
	public List<Student> getAllByPage(int pageNo,int pageSize);//分页
	
	//获得总共多少条数据
	public int getDataCount();//分页
	
	
	public int addStu(Student stu);
	//连接表
	public List<Student>  getStuAndGradeName(int pageNo, int pageSize);
//现在要有分页还需要有模糊查询。而且模糊查询不是必须有的
	//所以添加一个参数  条件参数 condition  这是提个字符串  可拼接的
	public List<Student> getStuAndGradeFuzzy(int pageNo, int pageSize,String condition);
	
	//查询数据库名字是否重复
	public boolean chaxunmingzichongfu(Student stu);
	
	
}
