package com.er;

public class Text {
	public static void main(String[] args) {
		Common s=new Common("9300", "����");
		s.jieshao();
		s.call();
		s.sendmessage();
	
		Phone asdf=new Common("2323232", "dsdsad");
		Common a=(Common)asdf;
		a.call();
		a.asd();
		Smart p=new Smart("note3", "С��");
		p.jieshao();
		p.call();
		p.sendmessage();
		p.paizhao();
		p.netWork();
		p.video("��ʱ����");
	}

}
