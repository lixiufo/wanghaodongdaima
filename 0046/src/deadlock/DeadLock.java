package deadlock;

public class DeadLock implements Runnable {
	A a=new A();
	B b=new B();
	public static void main(String[] args) {
		 DeadLock qw=new DeadLock();
	}
	
	public DeadLock() {
		new Thread(this).start();
		a.say(b);

	
	}

	@Override
	public void run() {
		b.say(a);
	}
}


class A{
	public synchronized void say(B b) {
		System.out.println("��ѱʸ��ң��Ұ�ֽ���㣬���򲻸���");
	b.get();
	}
	public synchronized void get() {
		System.out.println("����ֽ");
	}
}
class B{
	public synchronized void say(A a) {
		System.out.println("���ֽ���ң��Ұѱʸ��㣬���򲻸���");
	a.get();
	}
	public  synchronized void get() {
		System.out.println("�����");
	}
}





