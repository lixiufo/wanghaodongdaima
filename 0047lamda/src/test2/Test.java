package test2;



interface Message{
	public void test();
}
class Book{
	public Book(){
		System.out.println("���");
	}
}
public class Test {
	//��������   �������� ��ͨ����������ͨ���� �������þ�̬����
	//jdk1.8�����������  
	public static void main(String[] args) {
		Message mes=Book :: new;
		//��ʾ�����ӿڲ���ʵ�ֳ��󷽷� 
		//ʵ�ֵķ�������Book����� new  Ҳ���� ���췽��
		mes.test();

	}
}






