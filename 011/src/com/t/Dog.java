package com.t;

public class Dog extends Pet{
	private char sex;
    public void setSex(char sex) {
    	this.sex=sex;
    	}
    	
	public char getSex() {
		return sex;
	}
	public Dog(char sex, String name ,int age,int health) {
		super(age,name,health);
		this.sex=sex;
		}

public int prin(int a){
	
	System.out.println("�����Ա���"+getSex()+a);	
	return a;
}
	
	
	public void tohospital() {
		super.print();
		System.out.println("�Ա���"+getSex());
		System.out.println("���������������ҩ");
	}
	
	
}
