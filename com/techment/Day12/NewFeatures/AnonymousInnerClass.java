package com.techment.Day12.NewFeatures;

class Parent{
	void phone() {
		System.out.println("Mi");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.phone();
		
		Parent parent2 = new Parent()
		{
			void phone() {
				System.out.println("OnePlus");
			}
		};
		parent2.phone();	
	}

}
