package test4;

import java.util.function.Predicate;

public class Test3 {
public static void main(String[] args) {
	//����  ���� У������  ���� ���ǲ���һ���ַ����ǲ������� 
	String str="sA-=";
//	System.out.println(str.matches("\\d+"));
	Predicate<String> p=str::matches;
	System.out.println(p.test(".*[a-z]+.*")); 
	//java�ṩ����������֤������ʽ����  
	//lamda���ʽ 
	//1.����û�з���ֵ��
	//2.�����в����з���ֵ��  (���������Ļ�  ����Ҳ���Բ�д )
	//3.�����з���ֵ�� 
	
	//�������� 
	//1.��ͨ���� ��ͨ����
	//2.��̬����
	//3.���췽��
	
	//����ʽ�ӿ�
	//1.�����ͽӿ�
	//2.�����ͽӿ�
	//3.������  �������ͣ�
	//4.�����ͣ�У�飬���ԣ�
}
}

