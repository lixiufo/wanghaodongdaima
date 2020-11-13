package testthread;

public class xiancheng {
	public static void main(String[] args) {
		System.out.println("线程名称"+	Thread.currentThread().getName());
		Thread.currentThread().setName("你好");
		System.out.println("线程名称"+	Thread.currentThread().getName());
	
		System.out.println("优先级"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("优先级"+Thread.currentThread().getPriority());
	}

}
