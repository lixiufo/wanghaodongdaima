package com.lxf.exam2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Shijian {
	public static void main(String[] args) {
	Date date=new Date(System.currentTimeMillis());
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-d");
	String f=sdf.format(date);
	System.out.println(f);
	}
}


