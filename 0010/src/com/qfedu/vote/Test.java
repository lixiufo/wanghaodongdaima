package com.qfedu.vote;

public class Test {
	public static void main(String[] args) {
		//����������110���� 
		//�������ǵ��������˼��  ����Ҫ�� 110��ѡ����� 
	Voter v=new Voter();

		v.setName("�����");
	
		for (int i = 1; i <= 110; i++) {
			Voter v1=new Voter(i+"��Ϊ"+v.getName());
			v1.voteFor();
		}
		
		
//		int [] arr=new int[20];
//	Voter v1=new Voter("����");
//		voters[0]=v1;
		
		
		
		
//		Voter [] voters=new Voter[110];
//		for (int i = 0; i < voters.length; i++) {
//			voters[i]=new Voter("ѡ��"+(i+1)+"��");
//			voters[i].voteFor();
//		}
	}
}



