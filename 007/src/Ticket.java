import java.util.Scanner;
public class Ticket {
	String name;
	int age;
	public void buyTicket() {
		Scanner input=new Scanner(System.in);
		while(!"n".equals(name)) {
			if(age>=18) {
				System.out.println("������"+name+"������"+age+"��Ʊ��ȫƱ���۸�20");
			}else {
				System.out.println("������"+name+"������"+age+"��Ʊ�۸����");
			}
			System.out.println("�������������");
			name=input.next();
			if(!"n".equals(name)) {
				System.out.println("����������");
				age=input.nextInt();
			}
		}
		System.out.println("�����˳�");
	}
		public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
			Ticket v=new Ticket();
			System.out.println("�������������");
			v.name=input.next();
			System.out.println("�������������");
			v.age=input.nextInt();
			v.buyTicket();
		}
}
