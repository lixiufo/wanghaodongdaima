package test4;

import java.util.function.Consumer;

public class Text1 {
	public static void main(String[] args) {
		//�����ͽӿ� Comsumer
		//��������ʹ�����ѽӿ���ʵ�� sout��� 
		Consumer<String>con=System.out::print;
		con.accept("Hello world");

	}
}
