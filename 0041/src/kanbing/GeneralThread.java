package kanbing;

	public class GeneralThread extends Thread {
		int num = 50;
	 
		public GeneralThread(String name) {
			super(name);
		}
	 
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 1; i <= num; i++) {
				System.out.println(this.getName() + i + "�����ڿ���");
	 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();//�������д�ӡ�쳣��Ϣ�ڳ����г����λ�ü�ԭ��
				}
				if (num == 10) {
					try {
						this.join(2000); // ������Դ�������߳�ʹ��
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}}

