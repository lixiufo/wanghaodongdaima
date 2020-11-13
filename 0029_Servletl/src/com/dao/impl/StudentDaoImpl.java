package com.dao.impl;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import com.dao.StudentDao;
import com.entity.Student;
import java.util.ArrayList;
import com.util.BaseDao;
public class StudentDaoImpl extends BaseDao implements StudentDao {

	@Override
	public int addStu(Student stu) {//增
		String sql="insert into stu(stuid,stuname,stuage,stugrade) values(?,?,?,?)";
		
		Object [] obj= {stu.getStuid(),stu.getStuname(),stu.getAge(),stu.getStugrade()};
		return this.modifyStuByAny(sql, obj);
	}

	@Override
	public int updateStuById() {//改

		return 0;
	}

	@Override
	public int delStuById() {//删
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int getStuCountByGid(Student stu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getAll() {
		String sql="select * from stu";
		Object [] obj= {};
		ResultSet rs=this.getStuByAny(sql, obj);
		List<Student> stuList=new ArrayList<Student>();
		try {
			while(rs.next()) {
				Student stu=new Student();
				stu.setStuid(rs.getInt(1)); 
				stu.setStuname(rs.getString(2));
				stu.setAge(rs.getInt("stuage"));
				stu.setStugrade(rs.getInt("gradeid"));
				
				stuList.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void selStu(Student stu) {
		String sql ="select * from stu where stuid=? and stuname=? ";
		Object [] obj = {stu.getStuid(),stu.getStuname()};
		ResultSet rs=this.getStuByAny(sql, obj);
		boolean flag =false;
		try {
			while(rs.next()) {
				 flag =true;	
			}
			if(flag) {
				System.out.println("有变化成功");
			}else {
				System.out.println("失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}

}}
	
	



