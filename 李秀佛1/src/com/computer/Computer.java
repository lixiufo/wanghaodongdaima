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
		System.out.println("计算机信息介绍");
		System.out.println("cpu的品牌是"+this.geta().getBrand()+"主频是"+this.geta().frequency());
		System.out.println("硬盘的容量是"+this.getDisk().capacity());
		System.out.println("内存的容量是"+this.getEms().getMemory());
	}

}
