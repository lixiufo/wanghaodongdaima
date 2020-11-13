package 迭代器;

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
		System.out.println("姓名："+s.name+"，年龄："+s.age);//输出对象属性
		System.out.println(s);//直接输出对象信息
		System.out.println(s.toString());//调用父类方法输出对象信息
	}
}