package qwet;

import java.util.Scanner;

public class Q5 extends Za {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������ɼ�");
		double score=input.nextDouble();
		if(score>=90) {
			System.out.println("����");
		}
		else if(score>=80) {
			System.out.println("����");		}
		else if(score>=60) {
			System.out.println("����");
		}
		else
			{System.out.print("������"+"\n");}
		
		
		
		
		
	}

}
