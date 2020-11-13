import java.util.Scanner;

public class Calc {
	
		Scanner input=new Scanner(System.in);
		public int addition() {
			System.out.println("加法运算");
			System.out.println("请输入第一个数");
			int num1=input.nextInt();
			System.out.println("请输入第二个数");
			int num2=input.nextInt();
			return num1+num2;
		}
		
		public int subtraction() {
			System.out.println("减法运算");
			System.out.println("请输入第一个数");
			int num1=input.nextInt();
			System.out.println("请输入第二个数");
			int num2=input.nextInt();
			return num1-num2;
		}
		public int multiplication() {
			System.out.println("乘法运算");
			System.out.println("请输入第一个数");
			int num1=input.nextInt();
			System.out.println("请输入第二个数");
			int num2=input.nextInt();
			int result=num1*num2;
			return result;
		}
		
		public int division() {
			System.out.println("除法运算");
			System.out.println("请输入第一个数");
			int num1=input.nextInt();
			System.out.println("请输入第二个数");
			int num2=input.nextInt();
			int result=num1/num2;
			return result;
		}
		public static void main(String[] args) {
//			Scanner input=new Scanner(System.in);
//			System.out.println("加法运算");
//			System.out.println("请输入第一个数");
//			int num1=input.nextInt();
//			System.out.println("请输入第二个数");
//			int num2=input.nextInt();
//			System.out.println("相加的结果是"+(num1+num2));
			Calc c=new Calc();
			int result=c.addition();
			System.out.println("接受后的值是"+result);
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			System.out.println(c.addition());;
			
		}
	}


