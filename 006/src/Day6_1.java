import java.util.Scanner;
public class Day6_1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int [] a= {8,4,2,1,23,344,12};
		int sum=0;
		for(int i=0; i<=6;i++) {
			sum+=a[i];
			System.out.print("值为"+a[i]+"  ");
		}
		System.out.println("\n和是"+sum);

		System.out.println("请输入一个数");
		int b=input.nextInt();
		boolean flag=false;
		for(int i=0;i<7;i++) {
			if(b==a[i]) {
				flag=true;
				break;
			}
		}

		if(flag) {
			System.out.println("猜对了");
		}
		else {
			System.out.println("猜错了");

		}





	}
}


