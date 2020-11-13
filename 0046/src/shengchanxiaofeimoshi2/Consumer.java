package shengchanxiaofeimoshi2;

public class Consumer implements Runnable{
private Message message;
	
	public Consumer(Message message) {
	this.message = message;
}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
		this.message.get();
		}
		
	}

}
