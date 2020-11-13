package com.entity;

import java.sql.Date;

public class House {
	private int id;
	private String description;
	private String housetype;
	private String money;
	private Date time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHousetype() {
		return housetype;
	}
	public void setHousetype(String housetype) {
		this.housetype = housetype;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public House(int id, String description, String housetype, String money, Date time) {
		this.id = id;
		this.description = description;
		this.housetype = housetype;
		this.money = money;
		this.time = time;
	}
	public House() {

	}
	@Override
	public String toString() {
		return "House [id=" + id + ", description=" + description + ", housetype=" + housetype + ", money=" + money
				+ ", time=" + time + "]";
	}
	
	
}
