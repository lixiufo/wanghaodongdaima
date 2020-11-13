package com.as;

public class Text {
	public static void main(String[] args) {
		Printer printer=new Printer();
		InkBox colorBox=new GrayBox();
		Paper A=new A4();
		printer.setInkbox(colorBox);
		printer.setPaper(A);
		printer.printWork();
		
		InkBox inkbox=null;//先定义一个墨盒 具体是啥类型的 不确定
		Paper paper=null;//先定义一个纸张 具体是多大的 也不确定
		inkbox=new GrayBox();
		paper=new A4();
		printer.setInkbox(inkbox);
		printer.setPaper(paper);
		printer.printWork();
		
	}	
}
