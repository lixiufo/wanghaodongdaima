package com.table;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2019", "root", "123456");
			String sql="insert into stu(stuname,stuage,stubir,stugrade) values(?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "马");
			ps.setInt(2,25);
			ps.setDate(3, new Date(System.currentTimeMillis()));
			ps.setInt(4, 3);
			int result=ps.executeUpdate();
			if(result>0) {
				System.out.println("添加成功");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

