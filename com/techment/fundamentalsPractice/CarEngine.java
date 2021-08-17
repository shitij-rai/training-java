package com.techment.fundamentalsPractice;

class Cars{
	int model;
	String name;
	Engine engine;
	
	public Cars(int model, String name, Engine engine) {
		super();
		this.model = model;
		this.name = name;
		this.engine = engine;
	}
	
	void dislpayCarDetails() {
		System.out.println("Car Model : " + model);
		System.out.println("Car Name : " + name);
		System.out.println("Engine id : " + engine.engineId);
		System.out.println("Engine Type : " + engine.engineType);
	}
}

class Engine{
	int engineId;
	String engineType;
	
	public Engine(int engineId, String engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}
	
	
}

public class CarEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine engine = new Engine(326, "V-6");
		Cars maruti = new Cars(920, "Baleno", engine);
		maruti.dislpayCarDetails();
	}

}
