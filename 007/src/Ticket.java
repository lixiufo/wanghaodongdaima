import java.util.Scanner;
public class Ticket {
	String name;
	int age;
	public void buyTicket() {
		Scanner input=new Scanner(System.in);
		while(!"n".equals(name)) {
			if(age>=18) {
				System.out.println("姓名是"+name+"年龄是"+age+"门票是全票，价格20");
			}else {
				System.out.println("姓名是"+name+"年龄是"+age+"门票价格免费");
			}
			System.out.println("请输入你的名字");
			name=input.next();
			if(!"n".equals(name)) {
				System.out.println("请输入年龄");
				age=input.nextInt();
			}
		}
		System.out.println("程序退出");
	}
		public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
			Ticket v=new Ticket();
			System.out.println("请输入你的名字");
			v.name=input.next();
			System.out.println("请输入你的年龄");
			v.age=input.nextInt();
			v.buyTicket();
		}
}
