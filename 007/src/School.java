public class School {
	int classRoom;
	double area;
	String address;
	String schoolName;
	int teacher;
	int stuSum;
	public void sk() {
		System.out.println("学校的占地面积是"+area+"在学校里学习");	}
	public void sleep() {
		System.out.println("学校名称是"+schoolName+"在学校里睡觉，"
				+ "这个学校的教室有"+classRoom)	;}
	public void eat() {
		System.out.println("学校的地址是"+address+"吃饭");}
	public static void main(String[] args) {
		//先来创建对象   new 
		School qfedu=new School();
		School s1=new School();
		s1.sleep();
		s1.eat();
		s1.sk();
		//使用对象的成员 包括成员属性 和成员方法 
		qfedu.address="郑州海为科技园";
		qfedu.area=5000.0;
		qfedu.classRoom=30;
		qfedu.schoolName="千锋教育";
		qfedu.teacher=30;
		qfedu.sk();
		qfedu.sleep();
		qfedu.eat();
		
	}
	
	
	
}
