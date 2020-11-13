package com.test1;

public class BuyTicket implements Runnable{
		//抢票 一共10张  黄牛只能抢一张 
		int count=10;
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (this) {
					if(count==0) {
						break;
					}
					System.out.println(Thread.currentThread().getName() + "抢到一张票，还剩余" + (count--));
					if (Thread.currentThread().getName().equals("黄牛党")) {
						break;
					}
				}
			}
		}
		
		public static void main(String[] args) {
			BuyTicket bt=new BuyTicket();
			Thread t1=new Thread(bt,"赵四");
			Thread t2=new Thread(bt,"广坤");
			Thread t3=new Thread(bt,"黄牛党");
			t1.start();
			t2.start();
			t3.start();
		}
	}


