import java.util.Scanner;

public class Day5_4 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������������������");
		int a=input.nextInt();
		for(int i=1;i<=a;i++){//������
			for(int j=1;j<a-i;j++)//���ƿո�
				System.out.print(" ");
			for(int k=1;k<=i*2-1;k++)//����*��
				System.out.print(i);
			    System.out.println();
		}
	}
}
