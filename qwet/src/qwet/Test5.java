import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		//�ܲ�ʱ���� 10������  
		//Ȼ������Ա�  ��������������  Ů������Ů���� 
		Scanner input=new Scanner(System.in);
		System.out.println("����������ܲ�ʱ��");
		double time =input.nextDouble();
		System.out.println("����������Ա�");
		String sex=input.next();
		if(time<10) {
			System.out.println("��ϲ��������");
			//ʹ���ַ���  .  equals(����д���Ƚϵ�����)
			if(sex.equals("��")) {
				System.out.println("����������");
			}else if(sex.equals("Ů")){
				System.out.println("����Ů����");
			}
		}
	}
}
