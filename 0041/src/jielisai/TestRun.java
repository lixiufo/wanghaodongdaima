package jielisai;

	public class TestRun implements Runnable{
		//接力赛  4个人 1000米  每个人跑100米 跑完之后换人
		int meters=1000;
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (this) {
					if(meters<100) {
						break;
					}
					System.out.println(Thread.currentThread().getName() + "拿到了接力棒");
					for (int i = 0; i < 100; i += 10) {
						System.out.println(Thread.currentThread().getName() + "跑了" + (i + 10) + "米");
					}
					System.out.println(Thread.currentThread().getName() + "跑了100米，还剩余" + (meters -= 100));
				}
			}
		}
		
		public static void main(String[] args) {
			TestRun tr=new TestRun();
			Thread th1=new Thread(tr,"1号选手");
			Thread th2=new Thread(tr,"2号选手");
			Thread th3=new Thread(tr,"3号选手");
			Thread th4=new Thread(tr,"4号选手");
			th1.start();
			th2.start();
			th3.start();
			th4.start();
		}
		
	}

