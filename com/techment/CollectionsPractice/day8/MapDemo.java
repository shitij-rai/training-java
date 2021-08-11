package com.techment.CollectionsPractice.day8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;



public class MapDemo {

	public static void main(String[] args) {

		HashMap<Integer , String> hm = new HashMap<Integer , String>();
		hm.put(1, "John");
		hm.put(2, "Mike");
		hm.put(3, "Bob");
		hm.put(4, "Andrew");
		System.out.println(hm);
		
//		for(Entry <Integer,String> e : hm.entrySet()) {
//			
//		}
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("Ramesh", 77);
		lhm.put("Raj", 81);
		lhm.put("Bablu", 66);
		lhm.put("Sonu", 90);
		System.out.println(lhm);
		
		System.out.println("Values : ");  // Printing values
		for(int val : lhm.values()) {
			System.out.println(val);
		}
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("banana", 20);
		tm.put("apple", 40);
		tm.put("onion", 50);
		tm.put("egg", 70);
		
		System.out.println(tm);
		
	}

}
