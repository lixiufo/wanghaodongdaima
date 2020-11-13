

import java.util.Scanner;

public class Wz {

	public static void main(String [] args) {
		Scanner ni = new Scanner(System.in);
		System.out.print("请输入你的体测成绩");
		int math = ni.nextInt();
		System.out.print("请输入你的性别");
		String xing = ni.next();
		if(math<10) {
			System.out.println("恭喜你进入决赛!");
			if(xing.equals("男")) {System.out.println("进入男子组");}
			if(xing.equals("女")) {System.out.println("进入女子组");}

		}
	}
}
















}
