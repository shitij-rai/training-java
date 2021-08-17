package com.techment.Day12.NewFeatures;

interface Bank{
	void display();
}

public class LambdaDemo {

	public static void main(String[] args) {

		Bank bank = ()->System.out.println("This is display method");
		bank.display();
		
		Bank bank2 = ()->{
			System.out.println("This is multi line body");
			System.out.println("This is display method");
		};
		bank2.display();
	}

}
