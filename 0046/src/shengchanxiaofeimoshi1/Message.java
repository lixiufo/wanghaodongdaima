package shengchanxiaofeimoshi1;

public class Message {
	private String sex;
	private String hoppy;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHoppy() {
		return hoppy;
	}
	public void setHoppy(String hoppy) {
		this.hoppy = hoppy;
	}
public synchronized void set(String sex,String hoppy) {
	this.sex=sex;
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	this.hoppy=hoppy;
	
}
public synchronized void get() {
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(this.getSex()+"------"+this.getHoppy());	
}
}
