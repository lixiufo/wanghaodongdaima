import java.util.Scanner;
public class Day6_5 {
	public static void main(String[] args) {
		int max=0;
		int [] a=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("�������"+(i+1)+"����");
			a[i]=input.nextInt();
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.print("�������������:"+max);
	}

}
