package com.computer;

public class Computer {
	private CPU cpu;
	private EMS ems;
	private Disk disk;
	public CPU geta() {
		return cpu;
	}
	public void seta(CPU  cpu) {
		this.cpu = cpu;
	}
	public EMS getEms() {
		return ems;
	}
	public void setEms(EMS ems) {
		this.ems = ems;
	}
	public Disk getDisk() {
		return disk;
	}
	public void setDisk(Disk disk) {
		this.disk = disk;
	}
	public void Message() {
		System.out.println("�������Ϣ����");
		System.out.println("cpu��Ʒ����"+this.geta().getBrand()+"��Ƶ��"+this.geta().frequency());
		System.out.println("Ӳ�̵�������"+this.getDisk().capacity());
		System.out.println("�ڴ��������"+this.getEms().getMemory());
	}

}
