package ddfdsfd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dep_gai {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2019?useSSL=false", "root", "123456");
		Statement  statement=conn.createStatement();
		String sql="update dep set dname='体育部' where dname='批改部'";
		int result = statement.executeUpdate(sql);
		while(result>0) {
		System.out.println("成功");
		break;
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
