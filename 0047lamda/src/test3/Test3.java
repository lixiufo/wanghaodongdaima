package test3;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
	public static void main(String[] args) {

		String [] strArr= {"saa","asd","qwer","ytut"};
		//����String���͵ıȽ���
		Comparator<String> c=String ::compareToIgnoreCase;
		//���������Լ��ƶ��ķ�ʽ���Ƚ�  
		Arrays.sort(strArr, c);
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(strArr));

	}
}
