package com.techment.OopsAssignment.shape;

public class Rectangle implements Polygon{

	float length , breadth;

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
		
	@Override
	public void calcArea() {
		System.out.println("Area of Rectangle : " + length*breadth);
	}
			
	@Override
	public void calcPeri() {
		System.out.println("Perimeter of Rectangle : " + 2*(length+breadth));
	}	
}

