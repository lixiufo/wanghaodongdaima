package com.lxf.exam1;

public class Dog extends Animal{
//	public Dog () {
//
//	}
	public Dog(String name,String color,int leg) {
		super(name,color,leg);
	}
	public void eat() {
	System.out.println("�����й�ͷ");
	}
	public void LookHome() {
		System.out.println(this.getLeg()+"���ȵ�"+this.getColor()+this.getName()+"����");
	}

}