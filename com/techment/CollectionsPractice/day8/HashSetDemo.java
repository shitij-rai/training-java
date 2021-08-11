package com.techment.CollectionsPractice.day8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(4);
		hs.add(1);
		hs.add(9);
		hs.add(7);
		System.out.println(hs);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(4);
		lhs.add(9);
		lhs.add(11);
		lhs.add(20);
		lhs.add(5);
		System.out.println(lhs);
		
		TreeSet<String> trs = new TreeSet<String>();
		trs.add("hello");
		trs.add("this");
		trs.add("is");
		trs.add("java");
		System.out.println(trs);
	}

}
