package com.qqqq;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public  class Text {
        public static Connection getConn() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://Localhost:3306/java2019?useSSL=false","root", "123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
