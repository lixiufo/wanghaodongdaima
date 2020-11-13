import java.util.Scanner;

public class Day5_9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in) ;
		int connut=0;
			System.out.println("请输入学生人数");
			int renshu=input.nextInt();
			for(int i=1;i<=renshu;i++) {
				System.out.println("请输入第"+i+"个学生分数");
			    int fenshu=input.nextInt();
			if(fenshu<80) {
				continue;
			}
			connut++;
		
			}
			double j= (double)connut/renshu*100;
			System.out.println(j);
	}
}
