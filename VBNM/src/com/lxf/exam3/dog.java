package com.lxf.exam3;
public class dog {
	//	3. 创建一个 dog 类，并添加 name,eyeColor 字段，并给出至少两个构造方法，
	//	重写  toString() 方法，equals()方法和 hashCode()方法
	private String name;
	private String eyeColor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public dog(String name, String eyeColor) {
		this.name = name;
		this.eyeColor = eyeColor;
	}
	public dog() {
	} 
	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}	
		else if(obj instanceof dog) {
			dog b=(dog)obj;
			if(b.getName().equals(this.getName()) && b.getEyeColor().equals(this.getEyeColor()))
				return true;
		}
		return false;
	}
	

	public String toString() {
		return "[名字是" + name + ", 眼睛是" + eyeColor + "]";
	}

	public static void main(String[] args) {
		dog v=new dog("花花","黑色");
		System.out.println(v);
		System.out.println(v.hashCode());
	}

}
