
public class Day5_6 {
	public static void main(String [] args) {
		for(int i=1;i<=5;i++){//控制行
			for(int j=1;j<=5-i;j++)//控制空格
				System.out.print(" ");
			for(int k=1;k<=i*2-1;k++)//控制*号
				System.out.print("*");
			System.out.print("\n");
		}
		for(int i=4;i>=1;i--){//控制行
			for(int j=1;j<=5-i;j++)//控制空格
				System.out.print(" ");
			for(int k=1;k<=i*2-1;k++)//控制*号
				System.out.print("*");
			System.out.println();
		}
	}
}

