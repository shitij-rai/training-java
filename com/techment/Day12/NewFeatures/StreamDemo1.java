package com.techment.Day12.NewFeatures;

import java.util.ArrayList;

public class StreamDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(40);
		nums.add(90);
		
		nums.stream().forEach(i->System.out.println(i));
		
		
	}

}
