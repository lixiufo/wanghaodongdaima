import java.util.Scanner;

public class AAAA {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("今天学习分数合格了吗   y/n");
		String score=input.next();
		while(score.equals("n")) {
		
			System.out.println("上午看书");
			System.out.println("下午练习");
			System.out.println("今天学习分数合格了吗   y/n");
			 score=input.next();
		}
		System.out.println("合格");
		
		
		
		
		
	}

}
