package test3;


	interface message{
		public void text(String name);
	}
	class B{
		String name;
//		public B() {
//			System.out.println("你好");
//		}
		
		public B(String name) {
			System.out.println("这是一个有单构造的");
			this.name=name;
		}
	}
	public class Test {
		public static void main(String[] args) {
			message a=B::new;
			a.text("");
		}
		
		
		
		
		
}
