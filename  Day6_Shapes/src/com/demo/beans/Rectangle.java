package com.demo.beans;

public class Rectangle extends Shapes {
	private float length,breadth;
//	default constructor
	public Rectangle() {
		super();
	}
//	parameterized constructor
	public Rectangle(String c,float length, float breadth) {
		super(c);
		this.length = length;
		this.breadth = breadth;
	}
//	setters and getters method
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
//	Parameter of a rectangle
	public float para()
	{
		return 2*(length+breadth);
	}
	
//	Area of a rectangle
	public float area()
	{
		return length*breadth;
	}
	
//	toString() method
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	

}
