import java.util.Scanner;

public class Day6_4 {
	public static void main(String[] args) {
		double c=0;
		int [] a=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0; i<5;i++) {
			System.out.println("请输入第"+(i+1)+"门成绩");
			a[i]=input.nextInt();
			c+=a[i];
		}
		
			System.out.print(c/5);
			
		}
	}