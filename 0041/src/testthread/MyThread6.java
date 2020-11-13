package testthread;

public class MyThread6 implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"在执行");
			}
		}
		
		public static void main(String[] args) {
			MyThread6 mt=new MyThread6();
			Thread b=new Thread(mt);
			b.setName("年轻人爬完100米");
			b.start();
			for (int i = 0; i < 100; i++) {
				if(i==60) {
					System.out.println(Thread.currentThread().getName()+"你已经到达终点了");
					Thread.currentThread().yield();
				}
			//	System.out.println(Thread.currentThread().getName()+"开始了……");
				System.out.println("老年人爬完100米");
			}
		}
	}


