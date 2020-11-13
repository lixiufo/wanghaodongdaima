package test2;



interface Message{
	public void test();
}
class Book{
	public Book(){
		System.out.println("真棒");
	}
}
public class Test {
	//方法引用   构造引用 普通对象引用普通方法 类名引用静态方法
	//jdk1.8引入的新内容  
	public static void main(String[] args) {
		Message mes=Book :: new;
		//表示创建接口并且实现抽象方法 
		//实现的方法体是Book对象的 new  也就是 构造方法
		mes.test();

	}
}






