import java.util.Scanner;

public class Day3 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���������ʱ��");
		int time=input.nextInt();
		System.out.println("����������Ա�");
		String sex=input.next();
		if(time<10) {
			System.out.println("��ϲ�������");	
			if(sex.equals("��")) {
				System.out.println("��ϲ�������Ӿ���");	
			}
			if(sex.equals("Ů")) {
				System.out.println("��ϲ����Ů���ܾ���");	
			}		
		}else {
			System.out.println("���ź�������̭��");	
		}


	}

}
