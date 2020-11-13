import java.util.Scanner;
public class Day5_222 {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int num =0;
		do{
			System.out.println("请输入0-7的数字:");
			num = input.nextInt();
			if (num>7||num<0) {
				System.out.println("输入有误!,请重新输入");
		
			}
			else{
				switch(num){
				case 1: System.out.println("星期一");break;
				case 2: System.out.println("星期二");break;
				case 3: System.out.println("星期三");break;
				case 4: System.out.println("星期四");break;
				case 5: System.out.println("星期五");break;
				case 6: System.out.println("星期六");break;
				case 7: System.out.println("星期日");break;
				}
			}
		}
		while(num!=0);
		if (num==0) {
			System.out.println("结束");
		}
	}
}

