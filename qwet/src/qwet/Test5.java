import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		//跑步时间在 10秒以内  
		//然后根据性别  男生进入男子组  女生进入女子组 
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的跑步时间");
		double time =input.nextDouble();
		System.out.println("请输入你的性别");
		String sex=input.next();
		if(time<10) {
			System.out.println("恭喜你进入决赛");
			//使用字符串  .  equals(这里写被比较的内容)
			if(sex.equals("男")) {
				System.out.println("进入男子组");
			}else if(sex.equals("女")){
				System.out.println("进入女子组");
			}
		}
	}
}
