package com.techment.fundamentalsPractice;

class Animal{
	void walk(String s) {
		System.out.println(s + " is Walking...");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking...");
	}
}

class Cat extends Animal{
	void meow(){
		System.out.println("Cat is meowing...");
	}
}

public class HierarchyInheritanceDemo {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.meow();cat.walk("Cat");
		
		Dog dog = new Dog();
		dog.bark();dog.walk("Dog");
	}

}
