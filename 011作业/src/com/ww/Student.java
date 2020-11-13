package com.ww;

public class Student extends Person {

	private char sex;
	public Student(char sex,String name, int age) {
		super(name, age);
		this.sex=sex;
	
	}
//	private char sex;
//	public void setSex(char sex) {
//    	this.sex=sex;
//    	}
//    	
//	public char getSex() {
//		return sex;
//	}
	public void print() {
		super.print();
		System.out.println("ÐÔ±ðÊÇ"+sex);	
	}

		
	}


//