package com.entity;
import java.sql.Date;
public class Student {
	
	private int stuid;
	private String stuname;
	private int age;
	private Date stubir;
	private int stugrade;
	private int gradeid;
	
	public int getGradeid() {
		return gradeid;
	}
	public void setGradeid(int gradeid) {
		this.gradeid = gradeid;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getStubir() {
		return stubir;
	}
	public void setStubir(Date stubir) {
		this.stubir = stubir;
	}
	public int getStugrade() {
		return stugrade;
	}
	public void setStugrade(int stugrade) {
		this.stugrade = stugrade;
	}
	
	public Student(int stuid, String stuname, int age, Date stubir, int stugrade) {

		this.stuid = stuid;
		this.stuname = stuname;
		this.age = age;
		this.stubir = stubir;
		this.stugrade = stugrade;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", age=" + age + ", stubir=" + stubir
				+ ", stugrade=" + stugrade + ", gradeid=" + gradeid + "]";
	}

}
