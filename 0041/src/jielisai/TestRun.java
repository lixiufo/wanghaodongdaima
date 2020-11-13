package jielisai;

	public class TestRun implements Runnable{
		//������  4���� 1000��  ÿ������100�� ����֮����
		int meters=1000;
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (this) {
					if(meters<100) {
						break;
					}
					System.out.println(Thread.currentThread().getName() + "�õ��˽�����");
					for (int i = 0; i < 100; i += 10) {
						System.out.println(Thread.currentThread().getName() + "����" + (i + 10) + "��");
					}
					System.out.println(Thread.currentThread().getName() + "����100�ף���ʣ��" + (meters -= 100));
				}
			}
		}
		
		public static void main(String[] args) {
			TestRun tr=new TestRun();
			Thread th1=new Thread(tr,"1��ѡ��");
			Thread th2=new Thread(tr,"2��ѡ��");
			Thread th3=new Thread(tr,"3��ѡ��");
			Thread th4=new Thread(tr,"4��ѡ��");
			th1.start();
			th2.start();
			th3.start();
			th4.start();
		}
		
	}

