package testthread;

public class test {
	public static void main(String[] args) {
		MyThread thread1=new MyThread();
		thread1.setName("�߳�A");
		thread1.start();
		
		MyThread thread2=new MyThread();
		thread2.setName("�߳�B");
		thread2.start();
	}

}
