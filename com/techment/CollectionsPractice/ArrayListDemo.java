package com.techment.CollectionsPractice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Insertion is not good in ArrayList (disadvantage)
		// Retrieval is good.
		
		ArrayList obj = new ArrayList();
		System.out.println("Size befor adding elements : " + obj.size()); // Default capacity of ArayList is 10
		
		obj.add(1);
		obj.add("hello");
		obj.add(15.23);
		
		System.out.println("Size after adding elements : " + obj.size());
		System.out.println("Elements : " + obj);
		
		obj.remove(Integer.valueOf(1));
		System.out.println("Elements after removing 1 : " + obj);
		
	}

}
