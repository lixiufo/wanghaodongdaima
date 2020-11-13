package com.t;

public class Qie extends Pet {
	private String breed;
	public void setBreed(String breed) {
		this.breed=breed;
	}

	public String getBreed() {
		return breed;
	}
	public Qie(String breed, String name ,int age,int health) {
		super(age,name,health);
		this.breed=breed;

	}
	
	public void pri() {
		super.print();
			System.out.println("宠物品种是"+getBreed());
			System.out.println("企鹅看病，打针吃药");
		}
	public void tohospital() {
		super.print();
	System.out.println("宠物品种是"+getBreed());
		System.out.println("企鹅看病，打针吃药");
	}
	}
	

