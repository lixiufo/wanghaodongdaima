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
			//��Ϊ����Ŀǰ�ǲ���������״̬ ���Ǳ����õ�ǰ�߳�ֹͣ  
			//sleep 
			//�õ�ǰ�߳�һֱ�ȴ�  ʹ��Object wait�ȴ�  notify����
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
			//Ŀǰ״̬������������ �������ѵ��̵߳ȴ� 
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
		//����Ļ��� ���ѵ��������ڵȴ����߳�   
		//Ŀǰ
		super.notify();
	}



}

