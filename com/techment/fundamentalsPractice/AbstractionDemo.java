package com.techment.fundamentalsPractice;

abstract class Banks{
	
	void Eligibility() {
		System.out.println("Above 18 age can open account.");
	}
	
	abstract int rateOfInterest(int r);
}

class BoB extends Banks{       // when any class extends abstract class , it needs to provide the implementation of the abstract method
	
	@Override
	int rateOfInterest(int r) {
		return r;
	}
}

class Hdfc extends Banks{       // when any class extends abstract class , it needs to provide the implementation of the abstract method
	
	@Override
	int rateOfInterest(int r) {
		return r;
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		
		Banks bank = new BoB();
		System.out.println(bank.rateOfInterest(5));
		bank.Eligibility();
	}

}
