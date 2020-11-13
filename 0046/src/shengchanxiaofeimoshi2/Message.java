package shengchanxiaofeimoshi2;

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
	private boolean flag=true;
	public synchronized void set(String sex,String hoppy) {
		if(flag==false) {
			//因为现在目前是不能生产的状态 我们必须让当前线程停止  
			//sleep 
			//让当前线程一直等待  使用Object wait等待  notify唤醒
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.sex=sex;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.hoppy=hoppy;
		this.flag=false;
		super.notify();
	}

	public synchronized void get() {
		if(flag==true) {
			//目前状态该生产数据了 就让消费的线程等待 
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getSex()+"------"+this.getHoppy());	
		this.flag=true;
		//这里的唤醒 唤醒的是其他在等待的线程   
		//目前
		super.notify();
	}



}

