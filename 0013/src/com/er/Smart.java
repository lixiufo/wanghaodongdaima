package com.er;

public class Smart extends Phone implements Network,Paizhao,Video {

	@Override
	public void sendmessage() {
		System.out.println("�����ֻ�����Ϣ");

	}

	@Override
	public void call() {
		System.out.println("�����ֻ���绰");
	}
	public Smart(String type,String brand) {
		super(type,brand);
	}

	@Override
	public void video(String videoName) {
		System.out.println("��ǰ���ڲ���"+videoName);
		
	}

	@Override
	public void paizhao() {
		System.out.println("����һ��");
		
	}

	@Override
	public void netWork() {
		System.out.println("�й��ƶ��źž��Ǻ�");
		
	}

}
