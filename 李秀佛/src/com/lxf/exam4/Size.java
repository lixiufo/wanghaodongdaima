package com.lxf.exam4;

import java.util.Arrays;

public class Size {
	public static void main(String[] args) {
		System.out.println("������ɵ�������:");
		int a[]=new int[10];
		for(int i=0;i<10;i++) {
			 a[i]=(int)(Math.random()*10);
			 if(3<a[i]&a[i]<8){
					System.out.print(a[i]+"  ");
			 } 
			 else {
				 System.out.print("");
			 }
			 
			 
//				System.out.print(a[i]+"  ");
		}
		
//		for(int i=0;i<10;i++) {
//			System.out.print(a[i]+"  ");
//		}
////		
//	Arrays.sort(a);
//	System.out.println();
//	System.out.println("���������ֵ��:"+a[9]);
//	System.out.println("��������Сֵ��:"+a[0]);
	}
}
