package com.qqqq;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lianjie {
	
	public  ResultSet  lianjie() {
		Connection conn=Text.getConn();
		String sql="select *   from emp,dep where dep.did=emp.eid";
		ResultSet a=null;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			a=ps.executeQuery();
			while(a.next()) {
				System.out.println(a.getInt(1));
				System.out.println(a.getString("ename"));
				System.out.println(a.getDate("ebir"));
				System.out.println(a.getInt("depid"));
				System.out.println(a.getInt("age"));
				System.out.println(a.getString("dname"));
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	
	}
	public static void main(String[] args) {
		Lianjie b=new Lianjie();
		b.lianjie();
	}
	}
















































































































































































































































//	public class Select {
//		public static ResultSet select() {
//			Connection sb=ConnUtil.connUtil();
//			ResultSet rt=null;
//			try {
//				String sql="select * from emp,dep where emp.depid=dep.did ";
//				PreparedStatement pt=sb.prepareStatement(sql);
//				rt=pt.executeQuery();
//				while(rt.next()) {
//					System.out.println(rt.getInt(1));
//					System.out.println(rt.getString("ename"));
//					System.out.println(rt.getDate("ebir"));
//					System.out.println(rt.getInt("depid"));
//					System.out.println(rt.getString("dname"));
//				}
//				return rt;
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			return null;
//		}
//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


