import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		//第一名 夏令营  第二名 电脑 第三名 硬盘 其他 没有奖励  
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的名次");
		int num=input.nextInt();
		//switch(这里写表达式 比如我们要判断名次 那么就写num这个变量名称) {
		//}
		//switch支持的数据类型  byte  short  int char 枚举 String
		//String 类型 在jdk 7 包含7 以后才支持 
		switch(num) {
		case 1:
			//case 1表示num==1  
			System.out.println("夏令营");
			break;
		case 2:
			System.out.println("电脑");
			break;
		case 3:
			System.out.println("硬盘");
			break;
		default:
			System.out.println("没有奖励");
			break;
		}
	}
}
