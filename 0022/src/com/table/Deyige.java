package com.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Deyige {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2019", "root", "123456");
			Statement statement=conn.createStatement();
			Scanner input=new Scanner (System.in);
			System.out.println("请输入你要查询的名字");
			String stuName=input.next();
			String sql="select * from stu where stuname='"+stuName+"'";
			ResultSet rs= statement.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1));;
				System.out.println(rs.getString(2));;
				System.out.println(rs.getInt("stuage"));;
				System.out.println(rs.getDate(4));;
				System.out.println(rs.getInt("stugrade"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}}}
