package com.techment.fundamentalsPractice;

public class JaggedArrays {

	public static void main(String[] args) {
		
//		int arr[][] = new int [3][];
		
//		arr[0] = new int[2];
//		arr[1] = new int[5];
//		arr[2] = new int[8];
		
		int arr[][] = {{1,6,9},{4},{5,7,3}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
