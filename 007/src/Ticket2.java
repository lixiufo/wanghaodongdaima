import java.util.Scanner;
public class Ticket2 {

	String nam="admin";
	String ke="123";
	public void buyTicket(String name,String key) {
		Scanner input=new Scanner(System.in);
		if(name.equals(nam)&&key.equals(ke)) {
			System.out.println("��¼�ɹ����������޸ĵ�����");
			key=input.next();
			System.out.println("�޸ĳɹ�");
			//	     	ke=key;
			System.out.println(key);
		}else {
			System.out.println("�޸�ʧ�ܣ�");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Ticket2 a=new Ticket2();
		System.out.println("����������û���");
		String name=input.next();
		System.out.println("�������������");
		String key=input.next();
		a.buyTicket(name, key);
	}
}
