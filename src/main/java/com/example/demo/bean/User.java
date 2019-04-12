package com.example.demo.bean;

import java.util.Date;

public class User {
	private String name;
	private int id;
	private Date birthday;
	private String mail;
	private String password;
	private short sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public short getSex() {
		return sex;
	}
	public void setSex(short sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", birthday=" + birthday + ", mail=" + mail + ", password="
				+ password + ", sex=" + sex + "]";
	}
	
}
