package com.entity;

public class HouseType {
private String housetype;

public String getHousetype() {
	return housetype;
}

public void setHousetype(String housetype) {
	this.housetype = housetype;
}

public HouseType(String housetype) {
	this.housetype = housetype;
}

public HouseType() {

}

@Override
public String toString() {
	return "HouseType [housetype=" + housetype + "]";
}
}
