package com.factory;

public class BMWFactory implements CarFactory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new BMW();
	}

}
