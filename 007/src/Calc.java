import java.util.Scanner;

public class Calc {
	
		Scanner input=new Scanner(System.in);
		public int addition() {
			System.out.println("�ӷ�����");
			System.out.println("�������һ����");
			int num1=input.nextInt();
			System.out.println("������ڶ�����");
			int num2=input.nextInt();
			return num1+num2;
		}
		
		public int subtraction() {
			System.out.println("��������");
			System.out.println("�������һ����");
			int num1=input.nextInt();
			System.out.println("������ڶ�����");
			int num2=input.nextInt();
			return num1-num2;
		}
		public int multiplication() {
			System.out.println("�˷�����");
			System.out.println("�������һ����");
			int num1=input.nextInt();
			System.out.println("������ڶ�����");
			int num2=input.nextInt();
			int result=num1*num2;
			return result;
		}
		
		public int division() {
			System.out.println("��������");
			System.out.println("�������һ����");
			int num1=input.nextInt();
			System.out.println("������ڶ�����");
			int num2=input.nextInt();
			int result=num1/num2;
			return result;
		}
		public static void main(String[] args) {
//			Scanner input=new Scanner(System.in);
//			System.out.println("�ӷ�����");
//			System.out.println("�������һ����");
//			int num1=input.nextInt();
//			System.out.println("������ڶ�����");
//			int num2=input.nextInt();
//			System.out.println("��ӵĽ����"+(num1+num2));
			Calc c=new Calc();
			int result=c.addition();
			System.out.println("���ܺ��ֵ��"+result);
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			
		}
	}


