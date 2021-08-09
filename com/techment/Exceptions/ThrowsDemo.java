package com.techment.Exceptions;

class Student{
	void checkEligibility(int age) throws ArithmeticException{
		if(age>=18) 
			System.out.println("You can apply for Loan.");
		else
			throw new ArithmeticException("You cannot apply for Loan.");
			// throw new ArithmeticException("You cannot apply for Loan.");
	}
}

public class ThrowsDemo {

	public static void main(String[] args) throws ArithmeticException{

		Student student = new Student();
		student.checkEligibility(11);
		
	}

}
