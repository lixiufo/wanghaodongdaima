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
		String name="���";
		int age=28;
		Date date=new Date(System.currentTimeMillis());
		int stugrade=9;
		String sql="insert into stu(stuname,stuage,stubir,stugrade) values('"+name+"','"+age+"','"+date+"','"+stugrade+"')";
		int result=statement.executeUpdate(sql);//����int���͵���Ӱ�������
		if(result>0) {
			System.out.println("����ɹ�");
		
		
	}

}}
