package com.ee;

import java.util.Random;

public class Szhong {
	public static void main(String[] args) {
		//包装类的构造方法
//		Integer i=new Integer("3");
//		int intId=i.intValue();
//		System.out.println(i);
		
		  String str = "123321";
		  int num = Integer.parseInt(str);
		  System.out.println(num);
	
		
		
		
		
		
//
//		Boolean z=new Boolean("true");
//		System.out.println(z);

		//包装类转换成基本类型
//		Integer b=new Integer(2);
//		int a=b.intValue();
//		System.out.println(a);

		//toString():以字符串形式返回包装对象表示的基本类型数据
//		String sex=Character.toString('男'); 
//		String id=Integer.toString(25);
//		System.out.println(sex);
//		System.out.println(id);
		
		
		
		
//		
//		Random rand=new Random();
//		 for(int i=0;i<20;i++){
//			 int num=rand.nextInt(18);
//			   System.out.println("第"+(i+1)+"个随机数是："+num); } 
//		 }
		
	
//		 Integer mn = Integer.valueOf(21);
//		 System.out.println(mn);
		
		

		//parseXXX()：把字符串转换为相应的基本数据类型数据（Character除外）（字符串->基本类型）
//		int num=Integer.parseInt("36"); 
//		boolean bool=Boolean.parseBoolean("false");

//
//
//		Double v = Double.valueOf ("125.3");
//		System.out.println(v);


		//基本类型和包装类的自动转换
		//装箱和拆箱
		//		Integer intObject = 5; 
		//		int intValue = intObject;
		//		System.out.println(intObject);
		//		System.out.println(Integer.MAX_VALUE);
		//		
		//		String str="abcdefg";
		//		System.out.println(str.length());
		//		
		//		String c=new String("abc");
		//		System.out.println(c);
//
//		String a="aBCd";
//		String b="abcd";
//		System.out.println(a.equals(b));
//		System.out.println(a.equalsIgnoreCase(b));
		
		//String str=a.toLowerCase();
//		System.out.println(a);
//		System.out.println(str);
//		String str1=b.toUpperCase();
//		System.out.println(str1);
//		String str2=str1.concat(str);
//		System.out.println(str1+str);
//		System.out.println(str2);
		
//		byte a=125;
//		System.out.println(a);
//		byte b='A';
//		byte c='a';
//		byte d='b';
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		//unicode表  万国码 世界通用的字符编码  
				//gbk  gb2312  latin 
				//截取字符串 包前不包后
//				String str="abfdefg中";
//				String str1=str.substring(3);
//				String str2=str.substring(0, 3);
//	System.out.println(str1);
//	System.out.println(str2);
//				System.out.println(str.indexOf("f"));
//				System.out.println(str.lastIndexOf("f"));
//				System.out.println(str.indexOf(98));
//				System.out.println(str.indexOf("中"));
//				System.out.println(str.indexOf(20013));
//				String str3="         abc de fgh ij kv        ";
//				String str4=str3.trim();//只去除前后的空格  
//				System.out.println(str4);
//				System.out.println(str4.replaceAll(" ",""));

				
		
				
//				String str3="         abc de fgh ij kv        ";
//						String [] strArr=str3.split(" ");//将字符串一空格进行拆分 
//						String str="";
//						for (int i = 0; i < strArr.length; i++) {
//							if(!(strArr[i].equals(" "))) {
//								str+=strArr[i];
//							}
//						}
//						System.out.println(str);
				//replace()  replaceAll()  前者不支持正则表达式
						
						
//						
//				String str3="      abc 童装， 聪明妈妈的    选择            ";
//			String str4=str3.replaceAll(" ", "");
				//第一个参数 表示被替换的字符 或者正则表达式
				//第二个参数  表示替换以后的字符
//			String str5=str3.replaceAll(" ", "");
//				System.out.println(str5);
//		System.out.println(str4);
//			
			
//			String [] a=";;".split(";",98);
//			String [] b=";a;;".split(";",8);
//			String [] c="  ;   ;  ;   ;".split(";",8);
//			System.err.println(a.length);
//			System.err.println(b.length);
//			System.err.println(c.length);
//			
//		 public static void main(String[] args) {
//			        String a = new String("ab"); // a 为一个引用
//			        String b = new String("ab"); // b为另一个引用,对象的内容一样
//		        String aa = "ab"; // 放在常量池中
//			         String bb = "ab"; // 从常量池中查找
//			         if (aa == bb) // true
//			            System.out.println("aa==bb");
//			        if (a == b) // false，非同一对象
//			            System.out.println("a==b");
//			         if (a.equals(b)) // true
//		             System.out.println("aEQb");
//			      if (42 == 42.0) { // true
//		             System.out.println("true");
//			        }
			    }
			
			
			
			
			}
			

	
