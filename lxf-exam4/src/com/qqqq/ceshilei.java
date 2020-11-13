package com.qqqq;


import java.sql.Date;

import org.junit.jupiter.api.Test;
import java.sql.ResultSet;
import java.sql.SQLException;;
class ceshilei {

	@Test
	void test() {
		/* fail("Not yet implemented"); */
	}
	//Ôö¼Ó
	@Test void testAdd() {
		String sql="insert into emp(ename,ebir,depid) value(?,?,?)"; 
		Object[] obj= {"¹Ø",new Date(System.currentTimeMillis()),3}; 
		int result=BaseDao.modifyStuByAny(sql,obj); 
		if(result>0) {
			System.out.println("ok"); 
		}else {
			System.out.println("no");
		} 
	}

	//É¾³ý
	@Test
	void testshan() {
		String sql="delete from  emp where eid=26";
		Object[] obj= {};
		int result=BaseDao.modifyStuByAny(sql, obj);
		if(result>0) {
			System.out.println("ok");
		}else {
			System.out.println("no");
		}
	}   


	@Test
	void ResultSet() {
		try {
			String sql="select * from emp ";
			Object[] obj= {};
			ResultSet result=BaseDao.getStuByAny(sql, obj);
			while(result.next()) {
				{System.out.print(result.getInt("eid"));
				System.out.print(result.getString("ename"));
				System.out.print(result.getInt("age"));
				
				System.out.println(" ");
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}



