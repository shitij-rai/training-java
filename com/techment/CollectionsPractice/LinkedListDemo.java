package com.techment.CollectionsPractice;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(50);
		list1.add(70);
		list1.add(90);
		list1.addLast(20);
		list1.addFirst(10);
		
		System.out.println(list1);
	}

}
