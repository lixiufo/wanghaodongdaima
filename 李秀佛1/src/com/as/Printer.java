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
		System.out.println("ʹ��"+this.getPaper().getSize()+"��ӡ"+this.getInkbox().getColor()+"��ɫ������");
	}
//	public Printer(InkBox inkbox, Paper paper) {
//		this.inkbox = inkbox;
//		this.paper = paper;
//	}
	public Printer() {
	}
	
}
