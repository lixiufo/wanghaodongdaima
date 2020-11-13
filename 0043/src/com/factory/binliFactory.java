package com.factory;

public class binliFactory implements CarFactory {

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new binli();
	}

}
