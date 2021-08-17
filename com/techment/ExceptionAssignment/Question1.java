package com.techment.ExceptionAssignment;

public class Question1 {

	public static void main(String[] args) {
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a + "/"+ b + " = " + a/b);
		}
		catch (ArithmeticException e) {
			System.out.println("Division by zero is not possible.");
		}
		catch(NumberFormatException e) {
			System.out.println("Only Integer Input is allowed.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No input received.");
		}
	}

}
