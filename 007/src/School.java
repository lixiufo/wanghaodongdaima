public class School {
	int classRoom;
	double area;
	String address;
	String schoolName;
	int teacher;
	int stuSum;
	public void sk() {
		System.out.println("ѧУ��ռ�������"+area+"��ѧУ��ѧϰ");	}
	public void sleep() {
		System.out.println("ѧУ������"+schoolName+"��ѧУ��˯����"
				+ "���ѧУ�Ľ�����"+classRoom)	;}
	public void eat() {
		System.out.println("ѧУ�ĵ�ַ��"+address+"�Է�");}
	public static void main(String[] args) {
		//������������   new 
		School qfedu=new School();
		School s1=new School();
		s1.sleep();
		s1.eat();
		s1.sk();
		//ʹ�ö���ĳ�Ա ������Ա���� �ͳ�Ա���� 
		qfedu.address="֣�ݺ�Ϊ�Ƽ�԰";
		qfedu.area=5000.0;
		qfedu.classRoom=30;
		qfedu.schoolName="ǧ�����";
		qfedu.teacher=30;
		qfedu.sk();
		qfedu.sleep();
		qfedu.eat();
		
	}
	
	
	
}
