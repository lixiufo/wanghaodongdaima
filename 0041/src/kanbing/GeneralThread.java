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
				System.out.println(this.getName() + i + "号正在看病");
	 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();//在命令行打印异常信息在程序中出错的位置及原因
				}
				if (num == 10) {
					try {
						this.join(2000); // 礼让资源给其他线程使用
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}}

