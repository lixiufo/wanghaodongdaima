package qwet;

import java.util.Scanner;

public class Day3 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������������");
		String str = input.next();
		char m= str.charAt(0);
		switch(m) {
		case '1':
			//case 1��ʾnum==1  
			System.out.println("����Ӫ");
			break;
		case '2':
			System.out.println("����");
			break;
		case '3':
			System.out.println("Ӳ��");
			break;
		default:
			System.out.println("û�н���");
			break;

		}

	}

}
