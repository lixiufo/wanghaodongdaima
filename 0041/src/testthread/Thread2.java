package testthread;

public class Thread2 extends Thread{
@Override
public void run() {
for (int i = 0; i < 10; i++) {
	System.out.println("�߳�����"+Thread.currentThread().getName()+":"+i);
	
}
}
public static void main(String[] args) {
	 Thread2 a=new  Thread2();
	 a.setName("�߳�A");
	 a.run();
	 
	 Thread2 b=new  Thread2();
	 b.setName("�߳�B");
	 b.run();
}
}
