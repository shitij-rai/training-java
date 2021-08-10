package com.techment.OopsAssignment.TestShape;
import com.techment.OopsAssignment.shape.*;

public class Question6 {

	public static void main(String[] args) {

		Square square = new Square(5);
		square.calcArea();
		square.calcPeri();
		
		Rectangle rectangle = new Rectangle(5, 6);
		rectangle.calcArea();
		rectangle.calcPeri();
	}

}
