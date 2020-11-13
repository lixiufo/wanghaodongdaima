package com.lxf.exam1;

import java.util.Date;

public class Integer {
	public int age;
	public String name;
	public char sex;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Integer(String name,int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Integer [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}


	

}
