package com.demo.beans;

abstract public class Shapes {
	private String color;
	
//	Default constructor
	public Shapes()
	{
		super();
	}
	
//	parameterized constructor
	public Shapes(String color)
	{
		super();
		this.color=color;
	}
	
//	 setter method
	public  void setColor(String color)
	{
		this.color=color;
	}
	
//	getter method
	public String getColor()
	{
		return color;
	}
	
//	toString()
    @Override
	public String toString() {
		return "Shapes [color=" + color + "]";
	}
    
//    abstract functions
    abstract public float area();
    abstract public float para();
    
}
