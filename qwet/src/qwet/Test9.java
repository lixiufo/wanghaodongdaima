import java.util.Scanner;

public class Test9 {
	public static void Add() {
		//��һ�� ����Ӫ  �ڶ��� ���� ������ Ӳ�� ���� û�н���  
				Scanner input=new Scanner(System.in);
				System.out.println("�������������");
				String str = input.next();
				char charnum= str.charAt(0);
				//switch(����д���ʽ ��������Ҫ�ж����� ��ô��дnum�����������) {
				//}
				//switch֧�ֵ���������  byte  short  int char ö�� String
				//String ���� ��jdk 7 ����7 �Ժ��֧�� 
				switch(charnum) {
				case "1":
					//case 1��ʾnum==1  
					System.out.println("����Ӫ");
					break;
				case "2":
					System.out.println("����");
					break;
				case "3":
					System.out.println("Ӳ��");
					break;
				default:
					System.out.println("û�н���");
					break;
				}
	}
	public static void main(String[] args) {
		
		Add();
		
	}
}
