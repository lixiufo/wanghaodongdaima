import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		//��һ�� ����Ӫ  �ڶ��� ���� ������ Ӳ�� ���� û�н���  
		Scanner input=new Scanner(System.in);
		System.out.println("�������������");
		String num=input.next();
		if(num.equals("һ")) {
			System.out.println("����Ӫ");
		}else if(num.equals("��")) {
			System.out.println("����");
		}else if(num.equals("��")) {
			System.out.println("Ӳ��");
		}else {
			System.out.println("û�н���");
		}
	}
}
