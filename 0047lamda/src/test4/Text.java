package test4;

import java.util.function.Function;

public class Text {
public static void main(String[] args) {
	//jdk1.8�������ṩ��һ�Ѻ���ʽ�Ľӿ� 
			//Ϊ�˷������ǵ�ʹ��  ��Щ�ӿڶ� java.util.function
			//1.�����ͽӿ�
			//2.�����ͽӿ�
			//3.������  �������ͣ�
			//4.�����ͣ�У�飬���ԣ�
	//�����������ڽ�һ���ַ�������ת��Ϊһ������
	System.err.println(Integer.parseInt("1000")+2);
	
	
	Function<String ,Integer> fun=Integer::parseInt;
	System.out.println(fun.apply("100")*2);
	
	
	
	System.err.println(String.valueOf(1)+1);
	//��������ת��Ϊһ���ַ���
	Function<Integer,String> fu=String::valueOf;
	System.out.println(fu.apply(100));
}
}
