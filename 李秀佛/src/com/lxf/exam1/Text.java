package com.lxf.exam1;
public class Text {
	public static void main(String[] args) {
		Animal dog=new Dog("花花", "彩色", 4);			
		dog.eat();
//		Dog m=new Dog("花花", "黑色", 5);               //这也是一种
//		m.LookHome();
		Dog a=(Dog) dog;
		a.LookHome();
		
		
		
		Animal cat=new Cat("国领", "肉色", 47, 23);				
		cat.eat();
		Cat b=(Cat) cat;
		b.catchMouse();






	}
}