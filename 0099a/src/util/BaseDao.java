package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.crypto.provider.RSACipher;

public class BaseDao {

	
	
	
	
	public int zengshanggai(String sql,Object [] obj) {
		Connection conn=ConnUtil.getConn();
		int result=0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
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
		Connection conn=ConnUtil.getConn();
		ResultSet rs=null;
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
}	

