package com.entity;

import java.sql.Date;


public class T_goods {
	private int id;
	private String goodsName;
	private double price;
	private String imgpath;
	private Date deployDate;
	private String description;
	private int typeld;
	public T_goodsType getT_goodsType() {
		return t_goodsType;
	}
	public void setT_goodsType(T_goodsType t_goodsType) {
		this.t_goodsType = t_goodsType;
	}
	private T_goodsType t_goodsType ;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImgpath() {
		return imgpath;
	}
	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	public Date getDeployDate() {
		return deployDate;
	}
	public void setDeployDate(Date deployDate) {
		this.deployDate = deployDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTypeld() {
		return typeld;
	}
	public void setTypeld(int typeld) {
		this.typeld = typeld;
	}
	public T_goods(int id, String goodsName, double price, String imgpath, Date deployDate, String description,
			int typeld, T_goodsType t_goodsType) {

		this.id = id;
		this.goodsName = goodsName;
		this.price = price;
		this.imgpath = imgpath;
		this.deployDate = deployDate;
		this.description = description;
		this.typeld = typeld;
		this.t_goodsType = t_goodsType;
	}
	public T_goods() {
	
	}
	@Override
	public String toString() {
		return "T_goods [id=" + id + ", goodsName=" + goodsName + ", price=" + price + ", imgpath=" + imgpath
				+ ", deployDate=" + deployDate + ", description=" + description + ", typeld=" + typeld
				+ ", t_goodsType=" + t_goodsType + "]";
	}

	
	
	
}
