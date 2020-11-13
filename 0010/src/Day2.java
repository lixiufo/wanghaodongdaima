
public class Day2 {
	int age;
	String name;
	char sex;
	public Day2(int age, String name,char sex) {
		this.age=age;
		this.name=name;
		this.sex=sex;	
		
	}
public void b() {
	System.out.println(age+name+sex);
	
	
}
	public static void main(String[] args) {
		Day2 a=new Day2(25, "ÀîĞã·ğ", 'ÄĞ');
	a.b();
	System.out.println(a.age);
//		System.out.println(a.age);
		
		
	}
}
