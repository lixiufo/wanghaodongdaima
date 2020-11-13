package com.lxf.exam1;
		

public class Cat extends Animal {
	private int age;
	
	
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Cat(String name, String color, int leg, int age) {
		super(name, color, leg);
		this.age = age;
	}

	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void catchMouse() {
		System.out.println("年龄是"+this.getAge()+"岁"+this.getLeg()+"条腿的"+this.getColor()+this.getName()+"抓老鼠");
	}
}
