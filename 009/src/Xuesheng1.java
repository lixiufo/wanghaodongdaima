import java.util.Scanner;

public class Xuesheng1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�����������");
		System.out.println("������ĳ�������");
		String name=input.next();
		System.out.println("��ѡ����Ҫ�����ĳ�������");
		int num=input.nextInt();
		if(num==1) {
			System.out.println("�������Ա�");
			String num1=input.next();
			if(num1.equals("��"));
			
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
