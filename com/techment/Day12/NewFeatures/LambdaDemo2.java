package com.techment.Day12.NewFeatures;

interface Calculation{
//	void add(int a , int b);
	int add(int a , int b);
	
	
}

public class LambdaDemo2 {

	public static void main(String[] args) {

//		Calculation calculation = (a,b)->System.out.println("Sum = "+ (a+b));
//		calculation.add(5, 4);
		
		Calculation calculation1 = (a,b)->a+b; // ins single line no need to mention return 
		
		Calculation calculation2 = (a,b)->{
			if(a>b)
				return a;
			return b;
		};
		
		System.out.println(calculation1.add(7, 5));
		System.out.println(calculation2.add(7, 5));
	}

}
