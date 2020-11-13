package com.ww;

public class Person {
     private String name;
     private int age;
//     public void setName(String name) {
//    	 this.name=name;
//     }
//     public String getName() {
//    	 return name;
//     }
//     public void setAge(int age) {
//    	 this.age=age;
//     }
//     public int getAge() {
//    	 return age;
//     }
     
     public Person(String name,int age) {
    	 this.name=name;
    	 this.age=age;
    	 
     }
     public void print() {
	System.out.println("名字是"+name+"年龄是"+age);	
}
	
     
     

}
