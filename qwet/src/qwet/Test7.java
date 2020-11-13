import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		//第一名 夏令营  第二名 电脑 第三名 硬盘 其他 没有奖励  
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的名次");
		String num=input.next();
		if(num.equals("一")) {
			System.out.println("夏令营");
		}else if(num.equals("二")) {
			System.out.println("电脑");
		}else if(num.equals("三")) {
			System.out.println("硬盘");
		}else {
			System.out.println("没有奖励");
		}
	}
}
