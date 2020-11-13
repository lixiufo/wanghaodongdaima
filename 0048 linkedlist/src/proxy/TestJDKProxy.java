package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJDKProxy {
	public static void main(String[] args) {
		//ͨ��jdk�������ṩ��һ�������� Proxy
		//��һ����������ļ�����  classLoader 
		//�ڶ�����������Ҫ����Ľӿ�  
		//�ӿ���߹涨��Щ����  
		//������������ ���������� 
		//cglib  ��̬����  
		Dicos dicos=new Dicos();
DiningRoom dr=(DiningRoom) Proxy.newProxyInstance(dicos.getClass().getClassLoader(), dicos.getClass().getInterfaces(), new InvocationHandler() {
			//��һ���Ǵ������  
			//�ڶ�����  ����ͨ��������Ҫִ�з����� ��������
			//������ ����ִ�еķ�������Ҫ�Ĳ���  
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//invoke  ���� 
				//���������Щ�������ǽ��и����Ժ���Ҫִ�е����� 
				System.out.println("��ˣ");
				System.out.println("��¥");
				Object obj=method.invoke(dicos, args);
				return obj;
			}
		});
		dr.eat();
	}
}
