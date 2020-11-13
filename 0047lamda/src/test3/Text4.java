package test3;
interface a<P,R>{
	public R getStr(P p);
}


public class Text4 {
	public static void main(String[] args) {
		a<Integer, String>c=String::valueOf;
		System.out.println(c.getStr(20));
		
		
		
		
	}

}
