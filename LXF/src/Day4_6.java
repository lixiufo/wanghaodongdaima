import java.util.Scanner;

public class Day4_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��ֵ��");
		int num = sc.nextInt();
		System.out.println("�������ֵ����������¼ӷ���");
		for (int i = 0; i <= num; i++) {
			System.out.println(i+"+"+(num-i)+"="+num);
		}
	}
}                      