package com.demo.beans;

public class Triangle extends Shapes {

	private float base;
	private float height;
	private float side1;
	private float side2;
//	Default constructor
	public Triangle() {
		super();
	}
//	parameterized constructor
	public Triangle(String c,float base, float height, float side1, float side2) {
		super(c);
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
//getters and setters methods
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getSide1() {
		return side1;
	}

	public void setSide1(float side1) {
		this.side1 = side1;
	}

	public float getSide2() {
		return side2;
	}

	public void setSide2(float side2) {
		this.side2 = side2;
	}
	
//	parameter of a triangle
	public float para()
	{
		return base+side1+side2;
	}
	
//	Area of triangle
	public float area()
	{
		return 0.5f*base*height;
	}
	

//	toString() method	
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", side1=" + side1 + ", side2=" + side2 + "]";
	}
	
	
	
}
