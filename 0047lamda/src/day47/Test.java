package day47;

public class Test {
	public static void main(String[] args) {
		//		Inter1 a=new Inter1() {
		//			@Override
		//			public void test() {
		//				System.out.println("你好");
		//			}
		//			
		//			@Override
		//			public void test2() {
		//				System.err.println("还好吧");
		//
		//			}
		//		};a.test();
		//		  a.test2();


		Abs b=new Abs() {

			@Override
			public void test2() {
				System.out.println("你不好");

			}
		};
		b.test2();


		//()->  这个属于lamda表达式的固定书写 格式 
		Inter1 i2=()->    System.out.print("你好");
		i2.test();
	}
}
