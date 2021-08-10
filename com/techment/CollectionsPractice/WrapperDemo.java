package com.techment.CollectionsPractice;

public class WrapperDemo {

	public static void main(String[] args) {

		int a = 100;
		Integer b = a; //Auto Boxing
		
		int c = b.intValue();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
