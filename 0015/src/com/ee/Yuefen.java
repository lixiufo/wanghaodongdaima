package com.ee;

import java.io.ObjectInputStream.GetField;
import java.util.Calendar;

public class Yuefen {
	public static void main(String[] args) {
		Calendar a=Calendar.getInstance();
		System.out.println("ʱ��"+a.getTime());
		System.out.println("������"+a.getTimeInMillis());
		System.out.println("ʱ��"+a.getTimeZone());
		System.out.println("���"+a.getWeekYear());
		System.out.println("�·�"+(a.get(Calendar.MONTH)+1));
		System.err.println("һ���е�Сʱ"+a.get(Calendar.HOUR_OF_DAY));
		System.out.println("һ�����е���"+a.get(Calendar.DAY_OF_MONTH));
	}

}
