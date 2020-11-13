package com.zzzz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Date;
public class TestQ {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2019?useSSL=false", "root", "123456");
		Statement  statement=conn.createStatement();
		String name="李浩";
		int age=28;
		Date date=new Date(System.currentTimeMillis());
		int stugrade=9;
		String sql="insert into stu(stuname,stuage,stubir,stugrade) values('"+name+"','"+age+"','"+date+"','"+stugrade+"')";
		int result=statement.executeUpdate(sql);//返回int类型的受影响的行数
		if(result>0) {
			System.out.println("插入成功");
		
		
	}

}}
