package chouxianglei;

public class Test {
	public static void main(String[] args) {
		AbstractFactory af=new AsusFactory();
		System.out.println(af.getBord().getBordName());
		System.out.println(af.getXianka().getxiankaName());
		
		AbstractFactory aa=new GigaFactory();
		System.out.println(aa.getBord().getBordName());
		System.out.println(aa.getXianka().getxiankaName());
		
		
		
	}

}
