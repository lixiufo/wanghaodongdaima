package testthread;

public class xiancheng {
	public static void main(String[] args) {
		System.out.println("�߳�����"+	Thread.currentThread().getName());
		Thread.currentThread().setName("���");
		System.out.println("�߳�����"+	Thread.currentThread().getName());
	
		System.out.println("���ȼ�"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("���ȼ�"+Thread.currentThread().getPriority());
	}

}
