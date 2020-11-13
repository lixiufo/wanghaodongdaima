package com.factory;

public class DasAutoFactory implements CarFactory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new DasAuto();
	}

}
