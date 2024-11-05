package com.demo.beans;

public class Circle extends Shapes {
	private float radius;
	static final float pi=3.142f;
	
//	default constructor
	public Circle()
	{
		super();
	}
//	parameterized constructor
	public Circle(String c,float radius)
	{
	    super(c);	
	    this.radius=radius;
	}
	
//	setter method
	public void setradius(float radius)
	{
		this.radius=radius;
	}
//	getter method
	public float getRadius()
	{
		return this.radius;
	}
	
//	parameter of a circle
	public float para()
	{
		return 2*pi*radius;
	}
	
//	Area of a circle
	public float area()
	{
		return pi*radius*radius;
	}
	
//	toString() method
	public String toString()
	{
		return super.toString()+"Circle[radius="+radius +"]";
	}
	

}
