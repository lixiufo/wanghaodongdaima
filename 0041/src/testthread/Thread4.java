package testthread;

public class Thread4 extends Thread{
	@Override
	public void run() {
	for (int i = 0; i <10; i++) {
		System.out.println(Thread.currentThread().getName()+"---"+i);
//		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
public static void main(String[] args) {
	Thread4 a=new Thread4();
	a.setName("线程A");
	a.start();
	
	Thread4 b=new Thread4();
	b.setName("线程B");
	b.start();
	
	
	
}		
	}


