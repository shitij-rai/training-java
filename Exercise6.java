import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		// Simple Calculator
		int num1,num2;
		char operator;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		num1 = scanner.nextInt();
		System.out.println("Enter the operator:");
		operator = scanner.next().charAt(0);
		System.out.println("Enter 2nd Number:");
		num2 = scanner.nextInt();
		
		switch (operator) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
			
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		
		case '/':
			System.out.println(num1 + " / " + num2 + " = " + (float)num1 / (float)num2);
			break;	
		default:
			System.out.println("Enter a valid operator.(+,-,*,/)");
			break;
		}
		scanner.close();

	}

}
