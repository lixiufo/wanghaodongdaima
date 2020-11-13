package com.entity;

public class T_user {
private int id;
private String username;
private String password;
private String phone;
private String mail;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public T_user(int id, String username, String password, String phone, String mail) {
	
	this.id = id;
	this.username = username;
	this.password = password;
	this.phone = phone;
	this.mail = mail;
}
public T_user() {

}
@Override
public String toString() {
	return "T_user [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone + ", mail="
			+ mail + "]";
}


}
