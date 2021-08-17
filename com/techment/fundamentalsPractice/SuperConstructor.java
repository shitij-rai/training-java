package com.techment.fundamentalsPractice;

class Parent1{
	
	int a;
	Parent1(int a){
		System.out.println("This is parent class constructor " + a);
	}
}

class Child1 extends Parent1{
	
	Child1(int x){
		super(x);
		System.out.println("This is child class constructor " );
	}
}

public class SuperConstructor {

	public static void main(String[] args) {

		Child1 child1 = new Child1(5);
		
				
		
	}

}
