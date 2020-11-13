package com.qqqq;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	public static int modifyStuByAny(String sql,Object [] obj) {
		Connection conn=Text.getConn();
		int result=0;
		try {
			PreparedStatement  ps=conn.prepareStatement(sql) ;
			for(int i=0; i<obj.length;i++) {
				ps.setObject(i+1,obj[i]);
			}
			result=ps.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	
	


	public static  ResultSet getStuByAny(String sql,Object [] obj) {
		Connection conn=Text.getConn();
		ResultSet rs=null;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			for(int i=0;i<obj.length;i++) {
				ps.setObject(i+1, obj[i]);
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(rs!=null) {
			return rs;
		}
		return null;
	}
	

}






