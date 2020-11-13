import java.util.Scanner;

public class Suanfa {
			Scanner input=new Scanner(System.in);
			public int jiafa() {
				System.out.println("加法运算");
				System.out.println("请输入第一个数");
				int num1=input.nextInt();
				System.out.println("请输入第二个数");
				int num2=input.nextInt();
				return num1+num2;
			}
			
			public int jianfa() {
				System.out.println("减法运算");
				System.out.println("请输入第一个数");
				int num1=input.nextInt();
				System.out.println("请输入第二个数");
				int num2=input.nextInt();
				return num1-num2;
			}
			public int chengfa() {
				System.out.println("乘法运算");
				System.out.println("请输入第一个数");
				int num1=input.nextInt();
				System.out.println("请输入第二个数");
				int num2=input.nextInt();
				return num1*num2;
			}
			
			public int chufa() {
				System.out.println("除法运算");
				System.out.println("请输入第一个数");
				int num1=input.nextInt();
				System.out.println("请输入第二个数");
				int num2=input.nextInt();
				return num1/num2;
			}
			public static void main(String[] args) {
				Suanfa c=new Suanfa();
				int n=c.jiafa();
				System.out.println(n);
				System.out.println(c.jianfa());
				System.out.println(c.chengfa());
				System.out.println(c.chufa());
			}
		}


