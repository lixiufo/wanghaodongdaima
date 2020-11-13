package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.StudentDao;
import com.entity.Grade;
import com.entity.Student;

import sun.security.action.GetIntegerAction;
import util.BaseDao;

public class StudentDaoImpl extends BaseDao implements StudentDao {

	@Override
	public boolean login(Student stu) {
		String sql ="select * from stu where stuid=? and stuname=? ";
		Object [] obj = {stu.getStuid(),stu.getStuname()};
	ResultSet rs=this.chazhao(sql, obj);
	boolean flag=false;
	try {
		while(rs.next()) {
			flag=(true);
		}
		
	} catch (SQLException e) {

		e.printStackTrace();
	}
	
	return flag;
	}

	@Override
	public List<Student> getAllStu() {
	String sql="select*from stu";
	Object [] obj= {};
	ResultSet rs=this.chazhao(sql, obj);
	List<Student> list=new ArrayList<Student>();
	try {
		while(rs.next()) {
			Student stu=new Student();
			stu.setStuid(rs.getInt(1));
			stu.setStuname(rs.getString(2));
			stu.setStuage(rs.getInt(3));
			stu.setStubir(rs.getDate(4));
			stu.setStugrade(rs.getInt(5));
			stu.setGradeid(rs.getInt(6));
			list.add(stu);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return list;
	}

	@Override
	public int delStuById(int stuid) {
		String sql="delete from stu where stuid =?";
		Object [] obj= {stuid};
		return this.zengshanggai(sql, obj);
	}

	
	
	@Override
	public Student getStuById(int stuid) {
		String sql="select * from stu where stuid=?";
		Object [] obj= {stuid};
		ResultSet rs=this.chazhao(sql, obj);
		Student stu=new Student();
		try {
			while(rs.next()) {
				stu.setStuid(rs.getInt(1));	
				stu.setStuname(rs.getString(2));
				stu.setStuage(rs.getInt(3));
				stu.setStubir(rs.getDate(4));
				stu.setGradeid(rs.getInt(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stu;
	}

	@Override
	public int updateStuById(Student stu) {
		String sql="update stu set stuname=? ,stuage=?,stubir=?,stugrade=? where stuid=?";
		Object [] obj= {stu.getStuname(),stu.getStuage(),stu.getStubir(),stu.getStugrade(),stu.getStuid()};
		return this.zengshanggai(sql, obj);
	}

	@Override
	public List<Student> getAllByPage(int pageNo, int pageSize) {
		String sql="select * from stu limit ?,?";
		//��ǰҳ�� -1  * ҳ����   
		//��һҳ  ��ʾ5������  ?,?  0 2   ��һҳ
		//��ʾ�������͵�����	2 2	�ڶ�ҳ
		//��ʾ������ ������    4  2	����ҳ
		//��ʾ������ �ڰ���  6  2	����ҳ
		Object [] obj= {(pageNo-1)*pageSize,pageSize};	//��ǰҳ�� -1  * ҳ����   
		ResultSet rs=this.chazhao(sql, obj);
		List<Student> list=new ArrayList<Student>();
		try {
			while(rs.next()) {
				Student stu=new Student();
				stu.setStuid(rs.getInt(1));	
				stu.setStuname(rs.getString(2));
				stu.setStuage(rs.getInt(3));
				stu.setStubir(rs.getDate(4));
				stu.setGradeid(rs.getInt(5));
				list.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;	
	}

	@Override//����ܹ�����������
	public int getDataCount() {
		String sql="select count(1) from stu";
		Object [] obj= {};
		ResultSet rs=this.chazhao(sql, obj);
		int count=0;
		try {
			while(rs.next()) {
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int addStu(Student stu) {
		String sql="insert into stu(stuname,stuage,stubir,stugrade) values(?,?,?,?)";
		Object [] obj= {stu.getStuname(),stu.getStuage(),stu.getStubir(),stu.getStugrade()};
		return this.zengshanggai(sql, obj);
	}

	@Override
	public List<Student> getStuAndGradeName(int pageNo, int pageSize) {
		String sql="select stu.stuname,stu.stuage,stu.stuid,stu.stubir,grade.gname from stu,grade where stu.gradeid=grade.gid limit ?,?";
		Object [] obj= {(pageNo-1)*pageSize,pageSize};
		ResultSet rs=this.chazhao(sql, obj);
		List<Student> list=new ArrayList<Student>();
		try {
			while(rs.next()) {
				Student stu=new Student();
				stu.setStuname(rs.getString(1)) ;
				stu.setStuage(rs.getInt(2));
				stu.setStuid(rs.getInt(3));
				stu.setStubir(rs.getDate(4));
				Grade grade=new Grade();
				grade.setGname(rs.getString(5));
				stu.setGrade(grade);
				list.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Student> getStuAndGradeFuzzy(int pageNo, int pageSize, String condition) {	//limit��Զ����� Ҫ�ڷ�ҳ֮ǰ��ƴ�ӵ�sqlƴ�ӽ��� 
		String sql="select *  from stu,grade where stu.gradeid=grade.gid "+condition+" limit ?,?";
		Object [] obj= {(pageNo-1)*pageSize,pageSize};
		ResultSet rs=this.chazhao(sql, obj);
		List<Student> list=new ArrayList<Student>();
		try {
			while(rs.next()) {
				Student stu=new Student();
				stu.setStuid(rs.getInt("stuid"));
				stu.setStuname(rs.getString("stuname"));
				stu.setStubir(rs.getDate("stubir"));
				stu.setStuage(rs.getInt("stuage"));
				Grade grade=new Grade();
				grade.setGname(rs.getString("grade.gname"));
				stu.setGrade(grade);
				list.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	
	}

	@Override//��ѯ�����Ƿ��ظ����ظ�����ע��
	public boolean chaxunmingzichongfu(Student stu) {
		String sql="select * from stu where stuname=?";
		Object [] obj= {stu.getStuname()};
	ResultSet rs=this.chazhao(sql, obj);
	try {
		while(rs.next()) {
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	}

}




