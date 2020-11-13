
public class Text {
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b,String c) {
		return a+b;
	}

	public static void main(String[] args) {
		Text a=new Text();
		System.out.println(a.add(12,34));
		System.out.println(a.add(545,5, "sd"));
	}










}
