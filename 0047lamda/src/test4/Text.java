package test4;

import java.util.function.Function;

public class Text {
public static void main(String[] args) {
	//jdk1.8给我们提供了一堆函数式的接口 
			//为了方便我们的使用  这些接口都 java.util.function
			//1.功能型接口
			//2.消费型接口
			//3.生产型  （供给型）
			//4.断言型（校验，测试）
	//比如我们现在将一个字符串类型转换为一个数字
	System.err.println(Integer.parseInt("1000")+2);
	
	
	Function<String ,Integer> fun=Integer::parseInt;
	System.out.println(fun.apply("100")*2);
	
	
	
	System.err.println(String.valueOf(1)+1);
	//数字类型转换为一个字符串
	Function<Integer,String> fu=String::valueOf;
	System.out.println(fu.apply(100));
}
}
