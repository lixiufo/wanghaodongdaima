	public class Ticket implements Runnable{
		int count=10;
		@Override
		public void run() {
	while(true) {
		synchronized (this) {
			
		
		if(count==0) {
			break;
		}
		count--;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����һ��Ʊ����ʣ��"+count);
		}
	}
			
		}
		public static void main(String[] args) {
			Ticket t=new Ticket();
			Thread t1=new Thread(t);
			t1.start();
			Thread t2=new Thread(t);
			t2.start();
			Thread t3=new Thread(t);
			t3.start();
		}
		
		//һ����10��Ʊ   
		//һ������������ 
//		int count=10;
//
//		@Override
//		public void run() {
//			while(true) {
//				//synchronized  ͬ���ؼ���
//				//�ؼ��ֵ�λ�ú���Ҫ
//				//this��ʾͬ����ǰ���� ��ʾͬʱֻ��һ���߳��ܹ�����ͬ�������
//				//50�д���  ����Ҫ���ݰ�ȫ��  ����ͬ��  
//				synchronized (this) {
//					if(count==0) {
//						break;
//					}
//					count--;
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("����һ��Ʊ����ʣ��" + count);
//				}
//			}
//		}
//		
//		public static void main(String[] args) {
//			Ticket t=new Ticket();
//			Thread t1=new Thread(t);
//			t1.start();
//			Thread t2=new Thread(t);
//			t2.start();
//			Thread t3=new Thread(t);
//			t3.start();
//		}
		
	}


