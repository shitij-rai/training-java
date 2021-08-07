import java.util.Scanner;
public class Exercise14 {

	public static void main(String[] args) {
		// The Super Market- Total Stock
		
//		int stockList[] = {4,11,13,20,55,41,33,5,9};
//		int total = 0; 
//		
//		for(int i=0;i<stockList.length;i++) {
//			total += stockList[i];
//		}
//		System.out.println("Total is " + total);
		
//		for(int i=0;i<=20;i+=2) {
//			System.out.println(i);
//		}
//		
//		for(int i=10;i>=1;i--) {
//			if(i!=1)
//				System.out.print(i + ",");
//			else
//				System.out.println(i);
//		}
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum += i;
//		}
//		System.out.println("Sum of first 10 numbers is " + sum);
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number for the table:");
//		int num = scanner.nextInt();
//		System.out.println("Enter the limit:");
//		int limit = scanner.nextInt();
//		
//		for(int i=1;i<=limit;i++) {
//			System.out.println(num + " * " + i + " = " + (num*i));
//		}
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		int k=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 || j==1 || j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
