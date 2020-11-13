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
		System.out.println("你把笔给我，我把纸给你，否则不给的");
	b.get();
	}
	public synchronized void get() {
		System.out.println("给你纸");
	}
}
class B{
	public synchronized void say(A a) {
		System.out.println("你把纸给我，我把笔给你，否则不给的");
	a.get();
	}
	public  synchronized void get() {
		System.out.println("给你笔");
	}
}





