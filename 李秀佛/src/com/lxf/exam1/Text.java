package com.lxf.exam1;
public class Text {
	public static void main(String[] args) {
		Animal dog=new Dog("����", "��ɫ", 4);			
		dog.eat();
//		Dog m=new Dog("����", "��ɫ", 5);               //��Ҳ��һ��
//		m.LookHome();
		Dog a=(Dog) dog;
		a.LookHome();
		
		
		
		Animal cat=new Cat("����", "��ɫ", 47, 23);				
		cat.eat();
		Cat b=(Cat) cat;
		b.catchMouse();






	}
}