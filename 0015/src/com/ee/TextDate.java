package com.ee;

import java.text.SimpleDateFormat;
import java.util.Date;
public class TextDate {
	public static void main(String[] args) {
	Date date=new Date(System.currentTimeMillis());
	SimpleDateFormat sdf=new SimpleDateFormat("������"+"y-M-d"+"\n" +"ʱ��"+"    "+ "HH:mm:ss");
	String f=sdf.format(date);
	System.out.println(f);
}
}