package com.maxnums;

public class MaxNumbersMain {
	public static void main(String[] args) {
		MaxNumbers m = new MaxNumbers();
		int[] arr = {3,5,1,6,4,99, 8};
		
		System.out.println("The max number in the array is: " +m.findMax(arr));
		System.out.println("The max number is: " +m.findMax(2, 5, 9));
	}
}
