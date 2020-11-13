package com.dao.impl;

import java.util.List;

import com.dao.GradeDao;
import com.entity.Grade;
import com.entity.Student;
import com.util.BaseDao;

public class GradeDaoImpl extends BaseDao implements GradeDao {

	@Override
	public int delGradeById(Grade grade) {
		String sql="delete from grade where gid=?";
		Object [] obj= {grade.getGid()};
		return this.modifyStuByAny(sql, obj);
	}

	@Override
	public int updateGradeById() {

		Grade grade=new Grade();
		Object[] obj= {grade.getGid()};
		String sql="update sgrade set gname='JAVA1907' where gid=?";
		return super.modifyStuByAny(sql, obj);
	}

	


}
