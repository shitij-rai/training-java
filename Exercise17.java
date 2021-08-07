import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String s){
		super(s);
	}
}

public class Exercise17 {

	public static void main(String[] args) {
		// Invalid Age Exception
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		try{if(age>=18)
			System.out.println("Welcome to Vote");
		else
			throw new InvalidAgeException("Not Eligible to Vote");
		}
		catch(InvalidAgeException e){
			System.out.println("You can Vote when you are 18 years old");
		}
	
	}

}
