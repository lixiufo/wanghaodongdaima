package com.qfedu.vote;
public class Voter {
	//һȺ����ͶƱ һ��Ͷ100Ʊ 
	private String name;
	public static int count=100;
	
	
	
	 public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	
	public Voter(String name) {
		this.name=name;
	}
	
	
	
	public Voter() {
		// TODO Auto-generated constructor stub
	}
	public void voteFor() {
		if(count<=0) {
			System.out.println("ͶƱ��Ѿ����������´�������");
			return;
		}else {
			count--;
			System.out.println("ѡ����"+name+"Ͷ��1Ʊ��ʣ��"+count);
}
			}
		}
