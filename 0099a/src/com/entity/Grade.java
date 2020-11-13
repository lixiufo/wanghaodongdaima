package com.entity;
public class Grade {
	private int gid;
	private String gname;
	
	public Grade(int gid, String gname) {
		this.gid = gid;
		this.gname = gname;
	}
	public Grade() {
		
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	@Override
	public String toString() {
		return "Grade [gid=" + gid + ", gname=" + gname + "]";
	}

}
