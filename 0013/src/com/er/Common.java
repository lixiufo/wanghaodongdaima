package com.er;

public class Common extends Phone {

	@Override
	public void sendmessage() {
		System.out.println("��ͨ�ֻ�����Ϣ");

	}

	@Override
	public void call() {
		System.out.println("��ͨ�ֻ���绰");
	}
	public Common(String type,String brand) {
		super(type,brand);
	}
	

	public void asd() {
		System.out.println("����󻵵�");
	}

}
