package day47;

public class Test {
	public static void main(String[] args) {
		//		Inter1 a=new Inter1() {
		//			@Override
		//			public void test() {
		//				System.out.println("���");
		//			}
		//			
		//			@Override
		//			public void test2() {
		//				System.err.println("���ð�");
		//
		//			}
		//		};a.test();
		//		  a.test2();


		Abs b=new Abs() {

			@Override
			public void test2() {
				System.out.println("�㲻��");

			}
		};
		b.test2();


		//()->  �������lamda���ʽ�Ĺ̶���д ��ʽ 
		Inter1 i2=()->    System.out.print("���");
		i2.test();
	}
}
