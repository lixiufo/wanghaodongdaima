import java.util.Scanner;

public class Day5_4 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你想输入的数字");
		int a=input.nextInt();
		for(int i=1;i<=a;i++){//控制行
			for(int j=1;j<a-i;j++)//控制空格
				System.out.print(" ");
			for(int k=1;k<=i*2-1;k++)//控制*号
				System.out.print(i);
			    System.out.println();
		}
	}
}
