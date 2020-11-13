package testthread;

public class Thread5 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("¿ªÊ¼Ö´ĞĞ");
		}

	}
	public static void main(String[] args) {
		Thread5 a=new Thread5();
		Thread b=new Thread(a);
		b.start();
		for (int i = 0; i < 10; i++) {
			if(i==3) {
				try {
					b.join(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"---"+i);
			
		}
				
	}
	
	
}
