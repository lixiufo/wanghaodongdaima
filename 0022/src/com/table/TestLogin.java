package com.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestLogin {
	public static void main(String[] args) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2019", "root", "123456");
				Statement st=conn.createStatement();
				Scanner input=new Scanner(System.in);
				System.out.println("请输入用户名");
				String userName=input.next();
				System.out.println("请输入密码");
				String userPwd=input.next();
				String sql="select * from stu where stuname='"+userName+"'and stugrade='"+userPwd+"'";
				ResultSet r=st.executeQuery(sql);
				boolean flag=false;
				while(r.next()) {
					flag=true;
				}
				if(flag) {
					System.out.println("登录成功");
				}else {
					System.out.println("用户名或者密码错误");
				}
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
