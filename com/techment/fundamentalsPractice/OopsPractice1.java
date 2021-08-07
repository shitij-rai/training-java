package com.techment.fundamentalsPractice;

class Car{
	int model;	// global variable
	String color;
	
	Car(int model,String color){
		this.model = model;
		this.color = color;
	}
	
	public String carState(int speed) {
		
		if(speed>=60)
			return "Car is moving Fast";
		else if (speed>0 && speed<=59)
			return "Car is moving Slow";
		return "Car is Stopped";
	}
	
	
}

public class OopsPractice1 {

	public static void main(String[] args) {
		
		Car audi = new Car(2021,"white");
		Car benz = new Car(2019,"Black");
		
		System.out.println("Audi " + audi.carState(60));
		System.out.println("Benz " + benz.carState(0));
	}

}
