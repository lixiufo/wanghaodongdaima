import java.util.Scanner;

public class Day6_6 {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			int [] scores=new int[5];
			for(int i=0;i<scores.length;i++) {
				System.out.println("请输入第"+(i+1)+"个人的成绩");
				scores[i]=input.nextInt();
			}
			
			
			int max=0;
			for (int i = 0; i < scores.length; i++) {
				if(max<scores[i]) {
					max=scores[i];
				}
			}
			System.out.println("最高的分数是"+max);
		}
	}



