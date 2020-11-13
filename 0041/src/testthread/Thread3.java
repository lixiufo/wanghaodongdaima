package testthread;

public class Thread3 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		Thread3 ma =new Thread3();
		Thread thread1=new Thread(ma);
		thread1.setName("线程A");
		thread1.start();
		
		Thread thread2=new Thread(ma);
		thread2.setName("线程B");
		thread2.start();
	}
	
	
}
