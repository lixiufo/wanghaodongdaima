package com.dao;
import java.sql.ResultSet;
import java.util.List;
import com.entity.Student;

public interface StudentDao {
	public int addStu(Student stu );
	public int updateStuById();
	public int delStuById();
	public List<Student>getAll();
	public int getStuCountByGid(Student stu);
	void selStu(Student stu);
}
