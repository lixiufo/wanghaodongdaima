import java.util.Scanner;

public class Day5_1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		boolean flag=true;
		for(int i=1;i<=5;i++) {
			System.out.println("�������"+i+"�ųɼ�");
			int score=input.nextInt();
			if(score<0) {
				System.out.println("����ɼ����д����");
				flag=false;
				break;
			}
			sum+=score;
		}
		if(flag) {
			System.out.println("ƽ������"+(sum/5));
		}else {
			System.out.println("�ɼ��д�����ƽ����");
		}
	}
}

