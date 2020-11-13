package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.dao.StudentDao;
import com.dao.impl.StudentDaoImpl;
import com.entity.Student;
import com.service.StuService;
import com.service.impl.StudentServiceImpl;

class MyTest {
	StudentDao sd=new StudentDaoImpl();
	@Test
	void test() {
		Student stu=new Student();
		stu.setAge(78);
		stu.setStuid(34);
		stu.setStuname("李f秀");
		stu.setStugrade(17);
		int result=sd.addStu(stu);
		if(result>0) {
			System.out.println("添加成功");
	}
	}
		
		
		
//		@Test
//	public void test() {
//			List<Student> list=sd.getAll();
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getStuname()+list.get(i).getAge());
//			}
//		}
//
//	}
	
	StuService ss=new StudentServiceImpl();
	@Test
	public void test2() {
		ss.delGradeByGid(2);
	}


}
