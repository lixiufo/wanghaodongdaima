package com.ee;

public abstract class  Person {
	private String name;
	private int number;
	private double wage;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	
	public void setWage(double wage) {
		this.wage=wage;
	}
	public double getWage() {
		return wage;
	}
	
	public Person(String name,int number,double wage) {
		this.name=name;
		this.number=number;
		this.wage=wage;
		
	}
	 public Person() {
		 
	 }
	
	public abstract void  work();
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
}
    