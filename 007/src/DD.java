						
public class DD {
	public int hoppy() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public String q() {
		return "ÀîËÄ";
	}
	public double  m() {
		return 0.4;
	}
		
	
	
	public static void main(String[] args) {
		DD w=new DD();
		w.m();
		w.hoppy();
		w.q();
//		String n=w.q();
		int h=w.hoppy();
		double r=w.m();
		System.out.println(w.q());
		System.out.println(h);
		System.out.println(r);
		System.out.println(w.m());
	}
}
																								