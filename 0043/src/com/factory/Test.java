package com.factory;

public class Test {
	//��������ģʽ  
		//�۲�����֮ǰд�ļ򵥹���
		//���ֵ�����  
		//1.���������µĲ�Ʒ  ��Ҫ�޸�Դ����
		//2.�����Ĺ�����̫������ʵ�����е��߼� 
		//��������ģʽ ��ÿһ�ֲ�Ʒ����Ϊһ������
		//������µĲ�Ʒ ��ô�����һ�������ͺ���  
		public static void main(String[] args) {
			CarFactory cf=new BMWFactory();
			System.out.println(cf.getCar().getName());
			
			
			
			
}
}