package shengchanxiaofeimoshi2;

public class Productor implements Runnable {
private Message message;

public Productor(Message message) {
	
	this.message = message;
}

@Override
public void run() {
for (int i = 1; i <20; i++) {
	if(i%2==0) {
		this.message.set("���ѵ���", "��������");
	}else {
		this.message.set("��������", "��������");
	}
}
	
}

}
