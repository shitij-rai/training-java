import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Leap Year Event
		
		int year;
		boolean leap = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		year = sc.nextInt();
		if (year%4==0) {
			if(year%4==0 && year%400==0) {
				leap = true;	
			}
			else if(year%4==0 && year%100==0)
				leap = false;
			else
				leap = true;
		}
		if(leap)
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
		sc.close();
	}

}
