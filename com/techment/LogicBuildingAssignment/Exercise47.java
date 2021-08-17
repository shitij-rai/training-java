package com.techment.LogicBuildingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

class NameSorting implements Comparator<Products>{
	@Override
	public int compare(Products o1, Products o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class Exercise47 {

	public static void main(String[] args) {

//		Create a list of Product Objects with id,name and price as 
//		attributes and store the objects into an array . Display the 
//		products in ascending order of their names.
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Products> productList = new ArrayList<Products>();
		
		System.out.println("Enter the p_id , price , name of the 5 products : ");
		for(int i=0;i<5;i++) {
			 productList.add(new Products(scanner.nextInt(), scanner.nextInt(), scanner.nextLine())) ;
		}
		
		Collections.sort(productList, new NameSorting());
		for(Products prods : productList) {
			System.out.println("Product " + "[p_id=" + prods.p_id + " price=" + prods.price + " name=" + prods.name);
		}

		scanner.close();
		
	}

}
