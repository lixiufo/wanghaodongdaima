package com.table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestGetAll {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");//������ע�ᵽDriverManager����
			//·��ǰ׺ jdbc:mysql://+������ַ 127.0.0.1  localhost+�˿ں�+���ݿ������
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2019?useSSL=false", "root", "123456");
			 //�ڽ�����ɾ�Ĳ����ݲ���֮ǰ �������� ÿһ�������Ժ������ ����һ�ű��� 
			Statement  statement=conn.createStatement();
			 //Ҫ�������ݿ� ����Ҫ��sql���  
			String sql="select * from stu";
//			String sql="delete from stu where stuname='��ƺ�'";
//			Stam=ring sql="select * from stu where stuname='����'";
//			int result = statement.executeUpdate(sql);
			ResultSet result= statement.executeQuery(sql);
		    while(result.next()){
//			while(result>0) {
			//��������ȡ������ ��һ��һ�е�����
				//���Դ������� ָ������Ҫȡ����һ�� Ҳ���Դ���ڼ��� ��˳�� 
				//column ��  row  �� 
				//result.getInt(1);
				System.out.println(result.getInt(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString("stuid"));;
				System.out.println(result.getInt("stuage"));;
				System.out.println(result.getDate(4));;
				System.out.println(result.getInt("stugrade"));
//				System.out.println("�ɹ�");
//				break;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	
		}
	}


