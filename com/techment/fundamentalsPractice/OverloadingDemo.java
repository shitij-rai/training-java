package com.techment.fundamentalsPractice;

class Hello{
	
	public int sum(int x,int y) {
		return x+y;
	}
	
	public int sum(int x,int y,int z) {
		return x+y+z;
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello obj1 = new Hello();
		System.out.println(obj1.sum(5 , 4));
		System.out.println(obj1.sum(5, 4, 3));
	}

}
