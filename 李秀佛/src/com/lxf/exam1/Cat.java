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
		System.out.println("è����");
	}
	public void catchMouse() {
		System.out.println("������"+this.getAge()+"��"+this.getLeg()+"���ȵ�"+this.getColor()+this.getName()+"ץ����");
	}
}
