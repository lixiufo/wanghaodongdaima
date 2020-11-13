package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.crypto.provider.RSACipher;

public class BaseDao {
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	
	public int zengshanggai(String sql,Object [] obj) {
	conn=ConnUtil.getConn2();
		int result=0;
		try {
			 ps = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				ps.setObject(i+1, obj[i]);
			} 
			result=ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public ResultSet chazhao(String sql,Object [] obj) {
		Connection conn=ConnUtil.getConn2();
	
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				ps.setObject(i+1,obj[i]);
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		return rs;
	}
	
	
	
	public void closeResource() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}	

