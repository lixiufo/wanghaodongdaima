package com.qfedu.vote;

public class Qwer {
	private static String name;
	public static int count=100;
//	public void setName(String name) {
//		this.name=name;
//	}
//    public String getName() {
//    	return name;
//    }
//    
//    public Qwer() {
//    	
//    }
    public Qwer(String name) {
    	this.name=name;
    }
    public static void n() {
    	for (int i = 1; i <= 100; i++) {
    		Qwer k=new Qwer("���"+i+"��Ϊ����");
			System.out.println("ѡ��"+name+"Ͷ��1Ʊ,ʣ��"+(count-i));
    		
    		
		}
    }

    
    
    
    
    
    
}
