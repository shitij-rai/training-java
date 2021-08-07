import java.util.Scanner;
public class Exercise10 {

	static boolean isPrime(int n) {
	
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				return false;
				
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// First n prime numbers in a series
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number n upto which you want to print Prime no.s :");
		int number = scanner.nextInt();
		
		for(int i=2;i<=number;i++) {
			if(isPrime(i)) 
				System.out.print(i + " , ");
		}
		
		scanner.close();
	}

}
