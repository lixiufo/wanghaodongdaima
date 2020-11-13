package com.ee;

public class Jingli extends Person  {
	private double bonus;
	
	public void setBonus(double bonu) {
		this.bonus=bonu;
	}
	public double getBonus() {
		return bonus;
	}

	
	public Jingli(String name,int number,double wage,double bonus) {
	super(name,number,wage);
	this.bonus=bonus;
	}
	public void work() {
		System.out.println("李秀佛管理金国领敲代码");
	}
	
}
