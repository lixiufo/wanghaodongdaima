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
				System.out.println(Thread.currentThread().getName()+"��ִ��");
			}
		}
		
		public static void main(String[] args) {
			MyThread6 mt=new MyThread6();
			Thread b=new Thread(mt);
			b.setName("����������100��");
			b.start();
			for (int i = 0; i < 100; i++) {
				if(i==60) {
					System.out.println(Thread.currentThread().getName()+"���Ѿ������յ���");
					Thread.currentThread().yield();
				}
			//	System.out.println(Thread.currentThread().getName()+"��ʼ�ˡ���");
				System.out.println("����������100��");
			}
		}
	}


