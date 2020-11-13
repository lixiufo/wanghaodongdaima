	public class Ticket implements Runnable{
		int count=10;
		@Override
		public void run() {
	while(true) {
		synchronized (this) {
			
		
		if(count==0) {
			break;
		}
		count--;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("卖了一张票，还剩余"+count);
		}
	}
			
		}
		public static void main(String[] args) {
			Ticket t=new Ticket();
			Thread t1=new Thread(t);
			t1.start();
			Thread t2=new Thread(t);
			t2.start();
			Thread t3=new Thread(t);
			t3.start();
		}
		
		//一共有10张票   
		//一共三个人来抢 
//		int count=10;
//
//		@Override
//		public void run() {
//			while(true) {
//				//synchronized  同步关键字
//				//关键字的位置很重要
//				//this表示同步当前对象 表示同时只有一个线程能够访问同步代码块
//				//50行代码  不需要数据安全的  不用同步  
//				synchronized (this) {
//					if(count==0) {
//						break;
//					}
//					count--;
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("卖了一张票，还剩余" + count);
//				}
//			}
//		}
//		
//		public static void main(String[] args) {
//			Ticket t=new Ticket();
//			Thread t1=new Thread(t);
//			t1.start();
//			Thread t2=new Thread(t);
//			t2.start();
//			Thread t3=new Thread(t);
//			t3.start();
//		}
		
	}


