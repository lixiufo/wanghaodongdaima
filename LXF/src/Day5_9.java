import java.util.Scanner;

public class Day5_9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in) ;
		int connut=0;
			System.out.println("������ѧ������");
			int renshu=input.nextInt();
			for(int i=1;i<=renshu;i++) {
				System.out.println("�������"+i+"��ѧ������");
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
