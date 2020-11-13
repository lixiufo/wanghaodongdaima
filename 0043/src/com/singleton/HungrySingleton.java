package com.singleton;

public class HungrySingleton {
		
		//1.���췽��������˽�л�
		private HungrySingleton() {}
		
		//2.�ڵ�ǰ���д���һ��Ψһ�ĵ�ǰ���ʵ��  
		public static final HungrySingleton insatnce=new HungrySingleton();
		
		
		//3.��дһ�����ڻ�ȡ�������ľ�̬����
		
		public static HungrySingleton getInstance() {
			return insatnce;
		}
		
		
		
		
		public static void main(String[] args) {
			HungrySingleton instance1=HungrySingleton.getInstance();
			HungrySingleton instance2=HungrySingleton.getInstance();
			
			System.out.println(instance1==instance2);
		}
	}


