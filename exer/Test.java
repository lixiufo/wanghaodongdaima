package com.exer;

public class Test {
	public static void main(String[] args) {
		Printer printer=new Printer();
//		InkBox colorBox=new ColorBox();
//		Paper A4=new A4();
//		printer.setInkbox(colorBox);
//		printer.setPaper(A4);
//		printer.printWork();
		InkBox inkbox=null;//�ȶ���һ��ī�� ������ɶ���͵� ��ȷ��
		Paper paper=null;//�ȶ���һ��ֽ�� �����Ƕ��� Ҳ��ȷ��
		
		
		inkbox=new GrayBox();
		paper=new B5();
		printer.setInkbox(inkbox);
		printer.setPaper(paper);
		printer.printWork();
		
		
		
		
		
	}
}
