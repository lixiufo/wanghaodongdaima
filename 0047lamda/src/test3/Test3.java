package test3;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
	public static void main(String[] args) {

		String [] strArr= {"saa","asd","qwer","ytut"};
		//引用String类型的比较器
		Comparator<String> c=String ::compareToIgnoreCase;
		//按照我们自己制定的方式来比较  
		Arrays.sort(strArr, c);
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(strArr));

	}
}
