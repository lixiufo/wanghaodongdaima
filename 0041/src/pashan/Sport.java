package pashan;

	public class Sport extends Thread{
		//һ�������� һ����ͷ  
		//ÿ��100��ʾ  һ�� 
		//��������100����ʱ  500
		//��ͷ��100����ʱ  1500
		//����   1000
		private String name;
		private int time;
		private int length;
		
		
		
		public Sport(String name, int time, int length) {
			super();
			this.time = time;
			this.length = length;
		}

		@Override
		public void run() {
			while(length>0) {
				length-=100;
				System.out.println(Thread.currentThread().getName()+"����100�ף������յ㻹ʣ��"+length);
				try {
					Thread.currentThread().sleep(time);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"�������յ�");
		}
	}


