package com.t;

public class Test {
	public static void main(String[] args) {
		Master master=new Master();
		Pet dog=new Dog('��' ,"��" ,25,100)		;	//����ת��
		master.cure(dog);
		Dog k=(Dog)dog;
		k.prin(555555);
//		Pet qie=new Qie("Ů" ,"��",45,190);
//		Qie n=(Qie)qie;
//		n.pri();
//		master.cure(qie);
	}







}
