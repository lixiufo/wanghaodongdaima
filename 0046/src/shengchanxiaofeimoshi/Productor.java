package shengchanxiaofeimoshi;

public class Productor implements Runnable {
private Message message;

public Productor(Message message) {
	
	this.message = message;
}

@Override
public void run() {
for (int i = 1; i <20; i++) {
	if(i%2==0) {
		this.message.setSex("����");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.message.setHoppy("����");
	}
	else {
		this.message.setSex("Ů��");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.message.setHoppy("�廨");
	}
}
	
}

}
