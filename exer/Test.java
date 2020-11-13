package com.exer;

public class Test {
	public static void main(String[] args) {
		Printer printer=new Printer();
//		InkBox colorBox=new ColorBox();
//		Paper A4=new A4();
//		printer.setInkbox(colorBox);
//		printer.setPaper(A4);
//		printer.printWork();
		InkBox inkbox=null;//先定义一个墨盒 具体是啥类型的 不确定
		Paper paper=null;//先定义一个纸张 具体是多大的 也不确定
		
		
		inkbox=new GrayBox();
		paper=new B5();
		printer.setInkbox(inkbox);
		printer.setPaper(paper);
		printer.printWork();
		
		
		
		
		
	}
}
