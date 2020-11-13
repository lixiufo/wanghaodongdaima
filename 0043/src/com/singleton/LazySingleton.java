package com.singleton;

public class LazySingleton {
	
	//����ʽ ����ģʽ 
	//hibernate���������صķ�ʽ  lazyLoad()
	//����ģʽ��Ŀ����ʲô��
	//������������δ����ģ�new ����
	//1.�����췽��˽�л�  ����ֱ��new����������
	private LazySingleton() {}
	
	//2.����һ����ǰ�������� ��̬�� 
	public static LazySingleton instance=null;
	
	//3.ͨ�����������������ȡ ���� ������Ψһ��һ������ 
	//�������ڶ��߳������ �ܲ��ܱ�֤Ψһ��
	public static synchronized LazySingleton getInstance() {
		if(instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}
	
	
	
	public static void main(String[] args) {
		LazySingleton instance= LazySingleton.getInstance();
		LazySingleton instance2=LazySingleton.getInstance();
		System.out.println(instance==instance2);
	}
}
