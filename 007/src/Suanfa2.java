import java.util.Scanner;
public class Suanfa2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ����");
		int numa=input.nextInt();
		System.out.println("������ڶ�����");
		int numb=input.nextInt();
		Suanfa2 p=new Suanfa2();
		//p.jiafa(numa,numb);
		System.out.println(p.jiafa(numa,numb));
		System.out.println(p.jianfa(numa,numb));
		System.out.println(p.chengfa(numa,numb));
		System.out.println(p.chufa(numa,numb));
	}
	public int jiafa(int a,int b) {
		return a+b;
	}
	public int jianfa(int a,int b) {
		return a-b;
	}
	public int chengfa(int a,int b) {
		return a*b;
	}
	public int chufa(int a,int b) {
		return a/b;
	}
}


