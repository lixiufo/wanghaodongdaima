import java.util.Scanner;
public class Day5_222 {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int num =0;
		do{
			System.out.println("������0-7������:");
			num = input.nextInt();
			if (num>7||num<0) {
				System.out.println("��������!,����������");
		
			}
			else{
				switch(num){
				case 1: System.out.println("����һ");break;
				case 2: System.out.println("���ڶ�");break;
				case 3: System.out.println("������");break;
				case 4: System.out.println("������");break;
				case 5: System.out.println("������");break;
				case 6: System.out.println("������");break;
				case 7: System.out.println("������");break;
				}
			}
		}
		while(num!=0);
		if (num==0) {
			System.out.println("����");
		}
	}
}

