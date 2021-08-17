package com.techment.Day12.NewFeatures;

interface LargestOfThree{
	String largest(int a , int b , int c);
}

public class LambdaDemo3 {

	public static void main(String[] args) {

		LargestOfThree largestOfThree = (a,b,c)->{
			if(a>b && a>c)
				return a + " is largest";
			else if(b>a && b>c)
				return b + " is largest";
			else return c + " is largest";
		};
		System.out.println(largestOfThree.largest(7,11,15));
	}

}
