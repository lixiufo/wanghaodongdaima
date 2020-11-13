package qwet;

import java.util.Scanner;

public class Day3 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的名次");
		String str = input.next();
		char m= str.charAt(0);
		switch(m) {
		case '1':
			//case 1表示num==1  
			System.out.println("夏令营");
			break;
		case '2':
			System.out.println("电脑");
			break;
		case '3':
			System.out.println("硬盘");
			break;
		default:
			System.out.println("没有奖励");
			break;

		}

	}

}
