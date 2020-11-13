package pashan;

	public class Sport extends Thread{
		//一个年轻人 一个老头  
		//每爬100显示  一次 
		//年轻人爬100米用时  500
		//老头爬100米用时  1500
		//距离   1000
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
				System.out.println(Thread.currentThread().getName()+"爬了100米，距离终点还剩下"+length);
				try {
					Thread.currentThread().sleep(time);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"爬到了终点");
		}
	}


