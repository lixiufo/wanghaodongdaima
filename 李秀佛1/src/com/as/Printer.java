package com.as;
public class Printer {
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
//	public Printer(InkBox inkbox, Paper paper) {
//		this.inkbox = inkbox;
//		this.paper = paper;
//	}
	public Printer() {
	}
	
}
