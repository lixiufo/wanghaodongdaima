import java.util.Scanner;

public class Day4_5 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		int num=0;
		int score=0;
		for(int i=1;i<=5;i++) {
		System.out.println("�������"+i+"�ųɼ�");
		score=input.nextInt();
		num=num+score;		
		}
		
		System.out.println("�ܳɼ�ƽ����"+(num/5));	
	}

}
