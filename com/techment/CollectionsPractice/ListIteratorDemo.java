package com.techment.CollectionsPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(5);
		o1.add(6);
		o1.add(7);
		o1.add(8);
		o1.add(9);
		
		ListIterator<Integer> itr = o1.listIterator();
		
		System.out.println("Forward iterator:");
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println("\nBackward iterator:");
		while(itr.hasPrevious()) {
			System.out.print(itr.previous() + " ");
		}
	}

}
