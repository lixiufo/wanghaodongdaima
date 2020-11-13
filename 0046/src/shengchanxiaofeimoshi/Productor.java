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
		this.message.setSex("男生");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.message.setHoppy("放炮");
	}
	else {
		this.message.setSex("女生");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.message.setHoppy("绣花");
	}
}
	
}

}
