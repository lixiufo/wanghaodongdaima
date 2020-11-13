import java.util.Scanner;

public class Xuesheng1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎您来到宠物店");
		System.out.println("输入你的宠物名字");
		String name=input.next();
		System.out.println("请选择需要领养的宠物类型");
		int num=input.nextInt();
		if(num==1) {
			System.out.println("请输入性别");
			String num1=input.next();
			if(num1.equals("男"));
			
		}
		Xuesheng x=new Xuesheng();
		x.setHealth(67);
		x.getHealth();
		x.setIntimacy(76);
		x.getIntimacy();
		System.out.println(x.getHealth());
		System.out.println(x.getIntimacy());
}

}
