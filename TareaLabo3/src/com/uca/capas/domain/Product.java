package com.uca.capas.domain;

public class Product {
	private int code;
	private String name, description;
	private double price;
	private boolean hasOffer;
	
	public Product(int code, String name,
			String description, double price, boolean hasOffer) {
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
		this.hasOffer = hasOffer;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isHasOffer() {
		return hasOffer;
	}

	public void setHasOffer(boolean hasOffer) {
		this.hasOffer = hasOffer;
	}
}
