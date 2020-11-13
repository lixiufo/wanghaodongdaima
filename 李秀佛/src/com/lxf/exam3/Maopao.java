package com.lxf.exam3;
public class Maopao {
	public static void main(String[] args) {
		int temp;
		int [] arr= {9,16,23,25,90}; 
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {

				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("√∞≈›≈≈–Ú∫Û:");
		for (int j = 0; j< arr.length; j++) {

			System.out.print(arr[j]+"      ");
		} 
	}
}


