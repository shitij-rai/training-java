import java.util.Arrays;
import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		// Compare two Arrays
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of ararys");
		int n = scanner.nextInt();
		
		int array1[] = new int[n];
		int array2[] = new int[n];
		
		System.out.println("Enter elements of array1 :");
		for(int i=0;i<array1.length;i++) {
			System.out.println("Enter element " + (i+1) + " : ");
			array1[i] = scanner.nextInt();
		}
		
		System.out.println("Enter elements of array2 :");
		for(int i=0;i<array2.length;i++) {
			System.out.println("Enter element " + (i+1) + " : ");
			array2[i] = scanner.nextInt();
		}
		
		if(Arrays.equals(array1, array2))
			System.out.println("The arrays are Same");
		else
			System.out.println("The arrays are Different");
		
		scanner.close();
	}

}
