package com.techment.fundamentalsPractice;

class Parent{
	int a = 20;
}

class Child extends Parent{
	int a = 10;
	
	void sum() {
		int a = 5;
		int c = a + a;
		System.out.println("Sum c : " + c);
		
		int d = this.a + a;
		System.out.println("Sum d : " + d);
		
		int e = super.a + a;
		System.out.println("Sum e : " + e);
	}
}

public class SuperDemo {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.sum();

	}

}
