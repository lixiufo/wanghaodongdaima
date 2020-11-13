package com.factory;

public class Test {
	//工厂方法模式  
		//观察我们之前写的简单工厂
		//发现的问题  
		//1.不能生产新的产品  需要修改源代码
		//2.这样的工厂不太符合现实生活中的逻辑 
		//工厂方法模式 将每一种产品都作为一个工厂
		//如果有新的产品 那么再添加一个工厂就好了  
		public static void main(String[] args) {
			CarFactory cf=new BMWFactory();
			System.out.println(cf.getCar().getName());
			
			
			
			
}
}