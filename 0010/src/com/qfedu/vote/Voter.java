package com.qfedu.vote;
public class Voter {
	//一群人来投票 一共投100票 
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
			System.out.println("投票活动已经结束，请下次再来你");
			return;
		}else {
			count--;
			System.out.println("选民是"+name+"投了1票还剩余"+count);
}
			}
		}
