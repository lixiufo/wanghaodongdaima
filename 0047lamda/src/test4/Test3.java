package test4;

import java.util.function.Predicate;

public class Test3 {
public static void main(String[] args) {
	//断言  测试 校验类型  比如 我们测试一个字符串是不是数字 
	String str="sA-=";
//	System.out.println(str.matches("\\d+"));
	Predicate<String> p=str::matches;
	System.out.println(p.test(".*[a-z]+.*")); 
	//java提供的有用于验证正则表达式的类  
	//lamda表达式 
	//1.单行没有返回值的
	//2.单行有参数有返回值的  (单个参数的话  括号也可以不写 )
	//3.多行有返回值的 
	
	//方法引用 
	//1.普通对象 普通方法
	//2.静态方法
	//3.构造方法
	
	//函数式接口
	//1.功能型接口
	//2.消费型接口
	//3.生产型  （供给型）
	//4.断言型（校验，测试）
}
}

