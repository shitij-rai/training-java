import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		// Armstrong Number
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a 3 digit number:");
		int number = scanner.nextInt();
		int rem , sum=0 , temp;
		temp=number;
		while(number>0) {
			rem = number % 10;
			sum += rem*rem*rem;
			number /= 10;
		}
		if(sum == temp)
			System.out.println(temp + " is an Amstrong Number");
		else
			System.out.println(temp + " is not an Amstrong Number");
		
		scanner.close();
	}

}
