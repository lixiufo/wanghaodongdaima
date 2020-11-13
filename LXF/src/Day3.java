import java.util.Scanner;

public class Day3 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的时间");
		int time=input.nextInt();
		System.out.println("请输入你的性别");
		String sex=input.next();
		if(time<10) {
			System.out.println("恭喜进入决赛");	
			if(sex.equals("男")) {
				System.out.println("恭喜进入男子决赛");	
			}
			if(sex.equals("女")) {
				System.out.println("恭喜进入女子总决赛");	
			}		
		}else {
			System.out.println("很遗憾，逆淘汰了");	
		}


	}

}
