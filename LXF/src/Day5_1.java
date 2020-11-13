import java.util.Scanner;

public class Day5_1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		boolean flag=true;
		for(int i=1;i<=5;i++) {
			System.out.println("请输入第"+i+"门成绩");
			int score=input.nextInt();
			if(score<0) {
				System.out.println("输入成绩是有错误的");
				flag=false;
				break;
			}
			sum+=score;
		}
		if(flag) {
			System.out.println("平均分是"+(sum/5));
		}else {
			System.out.println("成绩有错不计算平均分");
		}
	}
}

