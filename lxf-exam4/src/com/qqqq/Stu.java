package com.qqqq;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Stu {
	
//	��
	public  int  addStu() {
		Connection conn=Text.getConn();
		String sql="insert into emp(ename,ebir,depid,age) values(?,?,?,?)";
		int result=0;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "�����");
			ps.setDate(2, new Date(System.currentTimeMillis()));
			ps.setInt(3, 23);
			ps.setInt(4, 45);
			result=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
//ɾ
	public  int  del() { 
		Connection conn=Text.getConn();
		String sql="delete from emp where eid=11";
		int resul=0;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			resul=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resul;
	}
	
//����
	public int changer() {
		Connection conn=Text.getConn();
		String sql="Update emp set depid=58  where eid=7";
		int resu=0;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			resu=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resu;
		
	}
	public static void main(String[] args) {
		Stu stu=new Stu();
		if(stu.addStu()>0) {
			System.out.println("��ӳɹ�");
			
			
		if(stu.del()>0)	{
			System.out.println("ɾ���ɹ�");
			
			
		if(stu.changer()>0)	{
			System.out.println("���ĳɹ�");
			
			
		}
			
		}}}}
			
		

