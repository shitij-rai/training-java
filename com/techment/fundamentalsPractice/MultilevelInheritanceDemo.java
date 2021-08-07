package com.techment.fundamentalsPractice;

class ElectronicDevice{
	void device() {
		System.out.println("This is an Electronc device");
	}
}

class Laptop extends ElectronicDevice{
	void type(){
		System.out.println("This is a Laptop");
	}
}

class Dell extends Laptop{
	void details() {
		System.out.println("This is a Dell Laptop");
	}
}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		
		Dell dell = new Dell();
		dell.details();dell.type();dell.device();
	}

}
