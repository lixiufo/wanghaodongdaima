import java.util.Scanner;

public class Da {
	public static void main(String[] args) {
		You a=new You();
		a.name="admin";
		a.key="0000";
		Scanner input=new Scanner(System.in);
		System.out.println("��¼");
		System.out.println("�������û���");
		String name=input.next();
		System.out.println("����������");
		String key=input.next();
		if(name.equals(a.name) && key.equals(a.key) ) {
			System.out.println("��¼�ɹ����������޸ĵ�����");
			a.key=input.next();
			System.out.println("�޸ĳɹ�");
			System.out.println(a.key);
		}else {
			System.out.println("�û��������������");

		      }
	}
}
