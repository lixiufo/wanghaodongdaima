import java.util.Scanner;

public class Da {
	public static void main(String[] args) {
		You a=new You();
		a.name="admin";
		a.key="0000";
		Scanner input=new Scanner(System.in);
		System.out.println("登录");
		System.out.println("请输入用户名");
		String name=input.next();
		System.out.println("请输入密码");
		String key=input.next();
		if(name.equals(a.name) && key.equals(a.key) ) {
			System.out.println("登录成功，请输入修改的密码");
			a.key=input.next();
			System.out.println("修改成功");
			System.out.println(a.key);
		}else {
			System.out.println("用户名或者密码错误");

		      }
	}
}
