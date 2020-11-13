package com.entity;

public class T_goodsType {
	private int id;
	private String typename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public T_goodsType(int id, String typename) {
		this.id = id;
		this.typename = typename;
	}
	public T_goodsType() {

	}
	@Override
	public String toString() {
		return "T_goodsType [id=" + id + ", typename=" + typename + "]";
	}

}
