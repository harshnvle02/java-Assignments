package com.demo.enums;


public enum Coffee {
	
   small(150,150), medium(200,200), big(400,400);
	
	private int size;
	private float price;

	private Coffee(int size, int price) {
		
		this.size = size;
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
