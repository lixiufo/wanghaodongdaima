package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJDKProxy {
	public static void main(String[] args) {
		//通过jdk给我们提供的一个代理来 Proxy
		//第一个参数的类的加载器  classLoader 
		//第二个参数是所要代理的接口  
		//接口里边规定哪些东西  
		//第三个参数是 代理适配器 
		//cglib  动态代理  
		Dicos dicos=new Dicos();
DiningRoom dr=(DiningRoom) Proxy.newProxyInstance(dicos.getClass().getClassLoader(), dicos.getClass().getInterfaces(), new InvocationHandler() {
			//第一个是代理对象  
			//第二个是  我们通过反射所要执行方法的 方法对象
			//第三个 是所执行的方法所需要的参数  
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//invoke  调用 
				//这个方法内些的是我们进行改造以后所要执行的内容 
				System.out.println("玩耍");
				System.out.println("二楼");
				Object obj=method.invoke(dicos, args);
				return obj;
			}
		});
		dr.eat();
	}
}
