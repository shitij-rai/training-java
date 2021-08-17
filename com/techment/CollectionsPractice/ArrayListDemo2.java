package com.techment.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		
		ArrayList<Integer> arr = new ArrayList<Integer>(); // Integer only
		arr.add(50);
		arr.add(60);
		arr.add(80);
		arr.add(20);
		arr.add(40);
		arr.add(10);
		System.out.println("arr : " + arr);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>(); // Integer only
		arr2.add(5);
		arr2.add(60);
		arr2.add(80);
		arr2.add(9);
		
		//arr2.addAll(arr);
		System.out.println("arr2 : " + arr2);
		Collections.sort(arr2);
		//arr2.removeAll(arr);
		System.out.println("arr2 after sorting : " + arr2);
		//System.out.println("arr2 after removing arr elements: " + arr2);
		
		ArrayList<String> employees = new ArrayList<String>(100); // String only , Default capacity = 100
		employees.add("emp1");
		employees.add("emp2");
		employees.add("emp3");
		
		ArrayList<String> batch1 = new ArrayList<String>();
		ArrayList<String> batch2 = new ArrayList<String>();
		
		batch1.add("sachin");
		batch1.add("ravi");
		batch1.add("kumar");
		batch1.add("soumya");
		
		batch2.add("sourab");
		batch2.add("manish");
		batch2.add("sachin");
		batch2.add("ankit");
		batch2.add("kumar");
		
		batch2.removeAll(batch1);
		batch1.addAll(batch2);
		Collections.sort(batch1);
		System.out.println(batch1);
		
	}

}
