package com.test1;

public class BuyTicket implements Runnable{
		//��Ʊ һ��10��  ��ţֻ����һ�� 
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
					System.out.println(Thread.currentThread().getName() + "����һ��Ʊ����ʣ��" + (count--));
					if (Thread.currentThread().getName().equals("��ţ��")) {
						break;
					}
				}
			}
		}
		
		public static void main(String[] args) {
			BuyTicket bt=new BuyTicket();
			Thread t1=new Thread(bt,"����");
			Thread t2=new Thread(bt,"����");
			Thread t3=new Thread(bt,"��ţ��");
			t1.start();
			t2.start();
			t3.start();
		}
	}


