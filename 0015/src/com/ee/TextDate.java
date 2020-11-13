package com.ee;

import java.text.SimpleDateFormat;
import java.util.Date;
public class TextDate {
	public static void main(String[] args) {
	Date date=new Date(System.currentTimeMillis());
	SimpleDateFormat sdf=new SimpleDateFormat("年月日"+"y-M-d"+"\n" +"时间"+"    "+ "HH:mm:ss");
	String f=sdf.format(date);
	System.out.println(f);
}
}