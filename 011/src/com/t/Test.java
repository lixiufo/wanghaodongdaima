package com.t;

public class Test {
	public static void main(String[] args) {
		Master master=new Master();
		Pet dog=new Dog('男' ,"李" ,25,100)		;	//向上转型
		master.cure(dog);
		Dog k=(Dog)dog;
		k.prin(555555);
//		Pet qie=new Qie("女" ,"秀",45,190);
//		Qie n=(Qie)qie;
//		n.pri();
//		master.cure(qie);
	}







}
