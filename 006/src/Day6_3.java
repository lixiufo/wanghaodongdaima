import java.util.Scanner;

public class Day6_3 {
	public static void main(String[] args) {
		int [] a=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0; i<5;i++) {
			System.out.println("�������"+(i+1)+"�ųɼ�");
			a[i]=input.nextInt();
		}
		for(int i=0; i<5;i++) {
			System.out.print(a[i]);
		}
	}

}
