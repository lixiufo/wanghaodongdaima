package com.lxf.exam1;
public class Animal {
	private String name;
	private String color;
	private int leg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	

public Animal(String name,String color,int leg) {
		this.name=name;
		this.color=color;
		this.leg=leg;
	}
	public void eat() {
		System.out.println("ÄãºÃ");
	
	}
	
	
}
