package ddfdsfd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Zeng {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2019", "root", "123456");
		String sql="insert into emp(eid,ename,ebir,depid) values(?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, 6);
		ps.setString(2,"小明");
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
