package com.example.demo.entity;

import java.util.Date;

public class User {
	private String name;
	private int id;
	private String birthday;
	private String mail;
	private String password;
	private short sex;
	public String account;
	public Date register_date;
	public Date update_date;
	public String update_user;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
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
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Date getRegister_date() {
		return register_date;
	}
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public String getUpdate_user() {
		return update_user;
	}
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", birthday=" + birthday + ", mail=" + mail + ", password="
				+ password + ", sex=" + sex + ", account=" + account + ", register_date=" + register_date
				+ ", update_date=" + update_date + ", update_user=" + update_user + "]";
	}
	
}
