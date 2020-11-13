package shengchanxiaofeimoshi;

public class Consumer implements Runnable{
private Message message;
	
	public Consumer(Message message) {
	this.message = message;
}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.message.getSex()+"-----"+this.message.getHoppy());
		}
		
	}

}
