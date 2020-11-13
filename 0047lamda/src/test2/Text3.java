package test2;

interface Inter<P,R>{
	public R get(P p);
}


public class Text3 {
	public static void main(String[] args) {
		String str=new String("abcdefg");
		
		Inter<String ,Boolean> v=str::startsWith;
		System.out.println(v.get("a"));
		System.out.println(v.get("a"));
		
		
		
		
	}

}
