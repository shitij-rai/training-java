package com.techment.LogicBuildingAssignment;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Choosing the Best Horse
		
		int w1,w2,w3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Weight of Horse 1:");
		w1 = sc.nextInt();
		System.out.println("Enter Weight of Horse 2:");
		w2 = sc.nextInt();
		System.out.println("Enter Weight of Horse 3:");
		w3 = sc.nextInt();
		
		if(w1>=w2 && w1>=w3) {
			if(w1==w2 || w1==w3)
				System.out.println("Entered weights are not distinct values.");
			else
				System.out.println(w1);
		}
		else if(w2>=w1 && w2>=w3) {
			if(w2==w1 || w2==w3)
				System.out.println("Entered weights are not distinct values.");
			else
				System.out.println(w2);
		}
		else {
			if(w3==w1 || w3==w2)
				System.out.println("Entered weights are not distinct values.");
			else
				System.out.println(w3);
		}
		sc.close();
	}
		

}
