package com.singleton;

public class HungrySingleton {
		
		//1.构造方法必须先私有化
		private HungrySingleton() {}
		
		//2.在当前类中创建一个唯一的当前类的实例  
		public static final HungrySingleton insatnce=new HungrySingleton();
		
		
		//3.编写一个用于获取这个对象的静态方法
		
		public static HungrySingleton getInstance() {
			return insatnce;
		}
		
		
		
		
		public static void main(String[] args) {
			HungrySingleton instance1=HungrySingleton.getInstance();
			HungrySingleton instance2=HungrySingleton.getInstance();
			
			System.out.println(instance1==instance2);
		}
	}


