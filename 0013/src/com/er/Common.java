package com.er;

public class Common extends Phone {

	@Override
	public void sendmessage() {
		System.out.println("普通手机发信息");

	}

	@Override
	public void call() {
		System.out.println("普通手机打电话");
	}
	public Common(String type,String brand) {
		super(type,brand);
	}
	

	public void asd() {
		System.out.println("你个大坏蛋");
	}

}
