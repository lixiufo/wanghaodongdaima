package com.qfedu.vote;

public class Test {
	public static void main(String[] args) {
		//假设现在有110个人 
		//按照我们的面向对象思想  我们要来 110个选民对象 
	Voter v=new Voter();

		v.setName("李秀佛");
	
		for (int i = 1; i <= 110; i++) {
			Voter v1=new Voter(i+"号为"+v.getName());
			v1.voteFor();
		}
		
		
//		int [] arr=new int[20];
//	Voter v1=new Voter("赵四");
//		voters[0]=v1;
		
		
		
		
//		Voter [] voters=new Voter[110];
//		for (int i = 0; i < voters.length; i++) {
//			voters[i]=new Voter("选民"+(i+1)+"号");
//			voters[i].voteFor();
//		}
	}
}



