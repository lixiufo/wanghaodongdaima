package com.ee;

import java.io.ObjectInputStream.GetField;
import java.util.Calendar;

public class Yuefen {
	public static void main(String[] args) {
		Calendar a=Calendar.getInstance();
		System.out.println("时间"+a.getTime());
		System.out.println("毫秒数"+a.getTimeInMillis());
		System.out.println("时区"+a.getTimeZone());
		System.out.println("年份"+a.getWeekYear());
		System.out.println("月份"+(a.get(Calendar.MONTH)+1));
		System.err.println("一天中的小时"+a.get(Calendar.HOUR_OF_DAY));
		System.out.println("一个月中的天"+a.get(Calendar.DAY_OF_MONTH));
	}

}
