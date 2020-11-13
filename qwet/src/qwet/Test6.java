import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		//获得到一个四位数  使用百位数字 与生成的随机数进行比较  如果相等 就中奖
		Scanner input=new Scanner(System.in);
		int guess=(int)(Math.random()*10);
		System.out.println("生成的随机数是"+guess);
		System.out.println("请输入你的卡号");
		int card=input.nextInt();
		int bai=card/100%10;
		if(guess==bai) {
			System.out.println("中奖了");
		}else {
			System.out.println("没有中奖");
		}
	}
}
