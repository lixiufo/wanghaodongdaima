package test3;


	interface message{
		public void text(String name);
	}
	class B{
		String name;
//		public B() {
//			System.out.println("���");
//		}
		
		public B(String name) {
			System.out.println("����һ���е������");
			this.name=name;
		}
	}
	public class Test {
		public static void main(String[] args) {
			message a=B::new;
			a.text("");
		}
		
		
		
		
		
}
