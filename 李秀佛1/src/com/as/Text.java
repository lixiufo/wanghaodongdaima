package com.as;

public class Text {
	public static void main(String[] args) {
		Printer printer=new Printer();
		InkBox colorBox=new GrayBox();
		Paper A=new A4();
		printer.setInkbox(colorBox);
		printer.setPaper(A);
		printer.printWork();
		
		InkBox inkbox=null;//�ȶ���һ��ī�� ������ɶ���͵� ��ȷ��
		Paper paper=null;//�ȶ���һ��ֽ�� �����Ƕ��� Ҳ��ȷ��
		inkbox=new GrayBox();
		paper=new A4();
		printer.setInkbox(inkbox);
		printer.setPaper(paper);
		printer.printWork();
		
	}	
}
