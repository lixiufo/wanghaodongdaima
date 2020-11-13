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
			//?��ʾռλ�� ռһ��λ�� Ȼ����ִ��sql���֮ǰ ���Դ�ֵ 
			String sql="select * from stu where stuname=? and stugrade=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "����");
			ps.setString(2, "4");
			ResultSet rs=ps.executeQuery();
			boolean flag=false;
			while(rs.next()) {
				flag=true;
			}
			if(flag) {
				System.out.println("��¼�ɹ�");
			}else {
				System.out.println("�û��������������");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
