package com.t;
public class Student {
	private String name;
	private String idcard;
	private int age;
	public void setName(String name) {
		this.name=name;

	}
	public String getName() { 
		return name;
	}

	public void setIdcard(String idcard) {
		this.idcard=idcard;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setAge(int age) {
		this.age=age;

	}
	public int getAge() {
		return age;
	}
	public Student(String name,String idcard,int age) {
		this.name=name;
		this.idcard=idcard;
		this.age=age;
	}
	

	
	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}	
		else if(obj instanceof Student) {
			Student b=(Student)obj;
			if(b.getName().equals(this.getName()) && b.getIdcard().equals(this.getIdcard()))
				return true;
			}
		return false;
	}
	public String toString() {
		return "[姓名是"+name+"年龄是"+age+"身份证号是"+idcard+"]";
	}
	
	
	public static void main(String[] args) {
		Student stu=new Student("李秀佛","410725",3);
		Student stu1=new Student("李秀佛","410725",23);
		System.out.println(stu1);
	System.out.println(stu.equals(stu1));
//		System.out.println(stu1.toString());//用于表示在内存中的地址  十六进制 
//		System.out.println(stu.toString());//用于表示在内存中的地址  十六进制 

	}
}