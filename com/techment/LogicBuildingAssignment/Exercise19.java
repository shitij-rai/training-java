package com.techment.LogicBuildingAssignment;
import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
//		1 2 3 4 5 6 5 4 3 2 1 
//		  1 2 3 4 5 4 3 2 1 
//		    1 2 3 4 3 2 1 
//		      1 2 3 2 1 
//		        1 2 1 
//		          1
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of lines to print :");
		int n = scanner.nextInt();
		 for(int i=1;i<=n;i++){
			 
			 for(int k=1;k<=2*i;k++) {
				 System.out.print(" ");
			 }
			 
			 for(int j=1;j<=n-i+1;j++) {
				 System.out.print(j + " ");
			 }
			 
			 for(int l=n-i;l>=1;l--) {
				 System.out.print(l + " ");
			 }
			 
			 System.out.println();
		 }
		 scanner.close();
	}

}
