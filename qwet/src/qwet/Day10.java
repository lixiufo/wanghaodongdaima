

import java.util.Scanner;

public class Day10 {
	public static void main(String [] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("��ϲ��������");
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
