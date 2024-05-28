package com;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Mobile {
	
	private int price;
	private String model;
	private String color;
	private int imei;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int price, String model, String color, int imei) {
		super();
		this.price = price;
		this.model = model;
		this.color = color;
		this.imei = imei;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Id
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	@Override
	public String toString() {
		return "Mobile [price=" + price + ", model=" + model + ", color=" + color + ", imei=" + imei + "]";
	}
	
	

}
