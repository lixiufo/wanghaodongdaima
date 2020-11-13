package com.lxf.exam1;

public class Dog extends Animal{
//	public Dog () {
//
//	}
	public Dog(String name,String color,int leg) {
		super(name,color,leg);
	}
	public void eat() {
	System.out.println("狗狗啃骨头");
	}
	public void LookHome() {
		System.out.println(this.getLeg()+"条腿的"+this.getColor()+this.getName()+"看家");
	}

}