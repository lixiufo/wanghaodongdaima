import java.util.Scanner;

public class Day6_3 {
	public static void main(String[] args) {
		int [] a=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0; i<5;i++) {
			System.out.println("请输入第"+(i+1)+"门成绩");
			a[i]=input.nextInt();
		}
		for(int i=0; i<5;i++) {
			System.out.print(a[i]);
		}
	}

}
