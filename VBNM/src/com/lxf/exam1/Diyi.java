package com.lxf.exam1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Diyi {
	public static void main(String[] args) {
		Map <String,Integer> hMa=new HashMap<String,Integer>();
		Integer b= new Integer("�����",24,'��');
		Integer c= new Integer("�����",23,'Ů');
		Integer d= new Integer("������",22,'��');
		Integer e= new Integer("���׽�",21,'��');
		hMa.put("1",b);
		hMa.put("2",c);
		hMa.put("3",d);
		hMa.put("4",e);
		for(Integer arraylist:hMa.values()) {
			System.err.println(arraylist);
		}
		for(String key:hMa.keySet()) {
			System.err.println(key);
		}
		for(Integer m :hMa.values()) {
			System.out.println(m);
		}
	}

}
