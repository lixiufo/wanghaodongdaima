package com.computer;

public class Amd implements CPU {

	@Override
	public String getBrand() {
		
		return "amd";
	}

	@Override
	public double frequency() {
	
		return 2.6;
	}

}
