package ������;

class Student
{
	String name = "Mary";
	int age = 21;
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Text{
	public static void main(String[] args)
	{
		Student s = new Student();
		System.out.println("������"+s.name+"�����䣺"+s.age);//�����������
		System.out.println(s);//ֱ�����������Ϣ
		System.out.println(s.toString());//���ø��෽�����������Ϣ
	}
}