package com.techment.TestDay8;

class Animal{
	
	public void shout() {
		System.out.println("Animal is shouting.");
	}
}

class Dog extends Animal{
	@Override
	public void shout() {
		System.out.println("Dog is Barking.");
	}
}

class Cat extends Animal{
	@Override
	public void shout() {
		System.out.println("Cat is Meowing.");
	}
}

class Horse extends Animal{
	@Override
	public void shout() {
		System.out.println("Horse is Neighing.");
	}
}

public class Question4 {

	public static void main(String[] args) {

		Animal animal = new Dog();
		Animal animal2 = new Cat();
		Animal animal3 = new Horse();
		animal.shout();
		animal2.shout();
		animal3.shout();
	}

}
