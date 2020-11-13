package kanbing;

	public class SpecialThread extends Thread {
		public SpecialThread(String n) {
			super(n);
		}
	 
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 1; i <= 10; i++) {
				System.err.println(this.getName() + i + "号这个在给人看病");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 
			}
		}
	}



