package com.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPreparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2019", "root", "123456");
			//?表示占位符 占一个位置 然后再执行sql语句之前 可以传值 
			String sql="select * from stu where stuname=? and stugrade=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "马云");
			ps.setString(2, "4");
			ResultSet rs=ps.executeQuery();
			boolean flag=false;
			while(rs.next()) {
				flag=true;
			}
			if(flag) {
				System.out.println("登录成功");
			}else {
				System.out.println("用户名或者密码错误");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
