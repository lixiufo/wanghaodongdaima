import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		//��õ�һ����λ��  ʹ�ð�λ���� �����ɵ���������бȽ�  ������ ���н�
		Scanner input=new Scanner(System.in);
		int guess=(int)(Math.random()*10);
		System.out.println("���ɵ��������"+guess);
		System.out.println("��������Ŀ���");
		int card=input.nextInt();
		int bai=card/100%10;
		if(guess==bai) {
			System.out.println("�н���");
		}else {
			System.out.println("û���н�");
		}
	}
}
