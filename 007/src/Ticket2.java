import java.util.Scanner;
public class Ticket2 {

	String nam="admin";
	String ke="123";
	public void buyTicket(String name,String key) {
		Scanner input=new Scanner(System.in);
		if(name.equals(nam)&&key.equals(ke)) {
			System.out.println("登录成功，请输入修改的密码");
			key=input.next();
			System.out.println("修改成功");
			//	     	ke=key;
			System.out.println(key);
		}else {
			System.out.println("修改失败！");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Ticket2 a=new Ticket2();
		System.out.println("请输入你的用户名");
		String name=input.next();
		System.out.println("请输入你的密码");
		String key=input.next();
		a.buyTicket(name, key);
	}
}
