import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");

		//		The Glass House
		int num , sum ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two digit number:");
		num = sc.nextInt();
		
		for(sum=0;num!=0;num/=10) {
			sum += num%10;
		}
		System.out.println("Sum of digits is "+ sum);
		sc.close();
	}

}
