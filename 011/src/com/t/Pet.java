package com.t;

public class Pet {
	private String name;
	private int age;
	private int health;

	public void setHealth(int health) {
		this.health=health;
	}

	public int getHealth() {
		return health;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age=age;
	}

	public int getAge() {
		return age;
	}
	public Pet(int age,String name,int health) {
		this.name=name;
		this.age=age;
		this.health=health;
	}
	public void print() {
		System.out.println("名字是"+getName()+"年龄是"+getAge()+"健康值是"+getHealth());
	}
	public void tohospital() {
	
	}
}
