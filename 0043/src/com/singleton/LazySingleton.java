package com.singleton;

public class LazySingleton {
	
	//懒汉式 单例模式 
	//hibernate中有懒加载的方式  lazyLoad()
	//单例模式的目的是什么？
	//创建对象是如何创建的？new 对象
	//1.将构造方法私有化  不能直接new来创建对象
	private LazySingleton() {}
	
	//2.创建一个当前类型属性 静态的 
	public static LazySingleton instance=null;
	
	//3.通过这个方法我们来获取 对象 并且是唯一的一个对象 
	//假设现在多线程情况下 能不能保证唯一性
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
