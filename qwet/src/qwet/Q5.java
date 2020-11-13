package qwet;

import java.util.Scanner;

public class Q5 extends Za {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入成绩");
		double score=input.nextDouble();
		if(score>=90) {
			System.out.println("优秀");
		}
		else if(score>=80) {
			System.out.println("良好");		}
		else if(score>=60) {
			System.out.println("及格");
		}
		else
			{System.out.print("不及格"+"\n");}
		
		
		
		
		
	}

}
