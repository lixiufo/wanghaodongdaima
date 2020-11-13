package test4;

import java.util.function.Consumer;

public class Text1 {
	public static void main(String[] args) {
		//消费型接口 Comsumer
		//我们现在使用消费接口来实现 sout输出 
		Consumer<String>con=System.out::print;
		con.accept("Hello world");

	}
}
