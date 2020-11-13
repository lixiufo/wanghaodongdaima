package com.exer;

public class Printer {
	//打印机目前组装 没有墨盒  也没有 纸张 
	//墨盒分为两种 但是这两种的规格都是一样的
	//纸张也分为两种  这两种的都属于纸张 材质是一样的 
	private InkBox inkbox;
	private Paper paper;
	public InkBox getInkbox() {
		return inkbox;
	}
	public void setInkbox(InkBox inkbox) {
		this.inkbox = inkbox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void printWork() {
		System.out.println("使用"+this.getPaper().getSize()+"打印"+this.getInkbox().getColor()+"颜色的字体");
	}
	public Printer(InkBox inkbox, Paper paper) {
		this.inkbox = inkbox;
		this.paper = paper;
	}
	public Printer() {
	}
	
	
	
	
	
}
