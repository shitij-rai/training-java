package com.techment.Day12.NewFeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFunctionalInterface {

	public static void main(String[] args) {

		Predicate<Integer> predicate = (num)-> num>=18; // Functional Interface , Takes 1 parameter of an type & returns boolean , It has test() method
		System.out.println(predicate.test(16));
		
		Predicate<String> strPredicate = (name)-> name.contains("i");
		System.out.println(strPredicate.test("Shitij"));
		
		Function<Integer , Integer> fun1 = (num1)-> num1;
		Function<Integer , String> fun2 = (num1)-> "num1 = " + num1;
		Function<String , Integer> fun3 = (str)-> str.length();
		
		System.out.println(fun1.apply(9));
		System.out.println(fun2.apply(9));
		System.out.println(fun3.apply("hii"));
		
	}

}
