package test;

public class Test {
	public static void main(String[] args) {
		Test1 c=(int a,int b)->  a+b;
		System.out.println(c.test1(20,30));
		
		Test1 d=(int a,int b)->  {
			int sum=a+b;
			return sum;
		};
		System.out.println(d.test1(30,30));
		
	}

}
