package com.techment.Day12.NewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
			numbers.add(i);
		
		System.out.println("numbers : " + numbers);
		System.out.println("Even : ");
		numbers.stream().filter(num->num%2==0).forEach(n->System.out.println(n));
		
		List<String> names = Arrays.asList("rohit","kohli","dhoni","sachin","akash");
		System.out.println("names not containing a : ");
		names.stream().filter(str->!(str.contains("a"))).forEach(s->System.out.println(s));
		
		System.out.println("By using map : ");
		numbers.stream().map(num->num+100).forEach(n->System.out.println(n));
		
		
	}

}
