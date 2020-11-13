package shengchanxiaofeimoshi1;

public class Productor implements Runnable {
private Message message;

public Productor(Message message) {
	
	this.message = message;
}

@Override
public void run() {
for (int i = 1; i <20; i++) {
	if(i%2==0) {
		this.message.set("男生", "放炮");
	}else {
		this.message.set("女生", "绣花");
	}
}
	
}

}
