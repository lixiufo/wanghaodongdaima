package com.entity;

import java.sql.Date;

public class Student {
	private int stuid;
	private String stuname;
	private int stuage;
	private Date stubir;
	private int stugrade;
	private int gradeid;
	private Grade grade;
	
	
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
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
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
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
	public int getGradeid() {
		return gradeid;
	}
	public void setGradeid(int gradeid) {
		this.gradeid = gradeid;
	}
	public Student(int stuid, String stuname, int stuage, Date stubir, int stugrade, int gradeid) {
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuage = stuage;
		this.stubir = stubir;
		this.stugrade = stugrade;
		this.gradeid = gradeid;
	}
	public Student() {
	
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stuage=" + stuage + ", stubir=" + stubir
				+ ", stugrade=" + stugrade + ", gradeid=" + gradeid + "]";
	}

}
