package com.er;

public class Smart extends Phone implements Network,Paizhao,Video {

	@Override
	public void sendmessage() {
		System.out.println("智能手机发信息");

	}

	@Override
	public void call() {
		System.out.println("智能手机打电话");
	}
	public Smart(String type,String brand) {
		super(type,brand);
	}

	@Override
	public void video(String videoName) {
		System.out.println("当前正在播放"+videoName);
		
	}

	@Override
	public void paizhao() {
		System.out.println("再来一次");
		
	}

	@Override
	public void netWork() {
		System.out.println("中国移动信号就是好");
		
	}

}
