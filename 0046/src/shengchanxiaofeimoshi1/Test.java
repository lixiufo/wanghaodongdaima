package shengchanxiaofeimoshi1;

public class Test {
public static void main(String[] args) {
	Message message=new Message();
	Productor a=new Productor(message);
	Thread b=new Thread(a);
	b.start();
	
	
	
//	new Thread(new Productor(message)).start();
	new Thread(new Consumer(message)).start();
}
}
