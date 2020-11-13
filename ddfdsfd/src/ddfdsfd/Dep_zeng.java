package ddfdsfd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dep_zeng {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2019", "root", "123456");
		String sql="insert into dep(did,dname) values(?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, 35);
		ps.setString(2,"招生部");
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
