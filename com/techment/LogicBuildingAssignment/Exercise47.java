package com.techment.LogicBuildingAssignment;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Products{
	int p_id,price;
	String name;
	
	public Products(int p_id, int price, String name) {
		super();
		this.p_id = p_id;
		this.price = price;
		this.name = name;
	}
	
}

public class Exercise47 {

	public static void main(String[] args) {

//		Create a list of Product Objects with id,name and price as 
//		attributes and store the objects into an array . Display the 
//		products in ascending order of their names.
		
		Scanner scanner = new Scanner(System.in);
		
		Products[] productList = new Products[5];
		
		System.out.println("Enter the p_id , price , name of the 5 products : ");
		for(int i=0;i<5;i++) {
			 productList[i] = new Products(scanner.nextInt(), scanner.nextInt(), scanner.nextLine());
			 
		}
		

		
	}

}
