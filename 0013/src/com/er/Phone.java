package com.er;

public abstract  class Phone {
	private String type;
	private String brand;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Phone() {
	}
	public Phone(String type,String brand) {
		this.type=type;
		this.brand=brand;
	}
	public abstract void sendmessage();
	public abstract void call();
	public void jieshao() {
		System.out.println("这是一款型号为"+type+"品牌为"+brand+"的手机");
	}

	
	
	
}
