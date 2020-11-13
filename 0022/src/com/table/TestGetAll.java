package com.table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestGetAll {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");//将驱动注册到DriverManager类中
			//路径前缀 jdbc:mysql://+主机地址 127.0.0.1  localhost+端口号+数据库的名称
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2019?useSSL=false", "root", "123456");
			 //在进行增删改查数据操作之前 先来分析 每一个操作以后的数据 都是一张报表 
			Statement  statement=conn.createStatement();
			 //要操作数据库 必须要有sql语句  
			String sql="select * from stu";
//			String sql="delete from stu where stuname='李浩浩'";
//			Stam=ring sql="select * from stu where stuname='马云'";
//			int result = statement.executeUpdate(sql);
			ResultSet result= statement.executeQuery(sql);
		    while(result.next()){
//			while(result>0) {
			//这里往外取出数据 是一列一列的往外
				//可以传入列名 指定我需要取出哪一列 也可以传入第几列 的顺序 
				//column 列  row  行 
				//result.getInt(1);
				System.out.println(result.getInt(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString("stuid"));;
				System.out.println(result.getInt("stuage"));;
				System.out.println(result.getDate(4));;
				System.out.println(result.getInt("stugrade"));
//				System.out.println("成功");
//				break;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	
		}
	}


