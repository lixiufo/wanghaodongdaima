import java.util.Scanner;

public class Day4_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个值：");
		int num = sc.nextInt();
		System.out.println("根据这个值可以输出以下加法表：");
		for (int i = 0; i <= num; i++) {
			System.out.println(i+"+"+(num-i)+"="+num);
		}
	}
}                      