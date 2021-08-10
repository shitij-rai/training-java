package com.techment.OopsAssignment.shape;

public class Square implements Polygon{
	float side;
		
	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		System.out.println("Area of Square : " + side*side);
	}
			
	@Override
	public void calcPeri() {
		System.out.println("Perimeter of Square : " + 4*side);
	}
}

