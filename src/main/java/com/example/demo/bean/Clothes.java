package com.example.demo.bean;

import java.util.Date;

public class Clothes {
	public int id;
	public String size;
	public Date release_date;
	public short sex;
	public String brand;
	public String category;
	public String style;
	public String img_path;
	public String discription;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Date getrelease_date() {
		return release_date;
	}
	public void setrelease_date(Date release_date) {
		this.release_date = release_date;
	}
	public short getSex() {
		return sex;
	}
	public void setSex(short sex) {
		this.sex = sex;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getimg_path() {
		return img_path;
	}
	public void setimg_path(String img_path) {
		this.img_path = img_path;
	}
	
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Clothes [id=" + id + ", size=" + size + ", release_date=" + release_date + ", sex=" + sex + ", brand="
				+ brand + ", category=" + category + ", style=" + style + ", img_path=" + img_path + ", discription="
				+ discription + "]";
	}
	
	
}
