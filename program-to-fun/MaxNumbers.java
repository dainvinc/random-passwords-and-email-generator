package com.maxnums;

public class MaxNumbers {
	public int findMax(int[] a) {
		int maxNum = 0;
		
		for(int i=0; i<a.length-1; i++) {
			if(a[i] > a[i+1]) {
				maxNum = a[i];
			} else {
				maxNum = a[i+1];
			}
		}
		
		return maxNum;
	}
	
	
	public int findMax(int a, int b, int c) {
		int maxNum = a;
		
		if(b > a && b > c) {
			maxNum = b;
		} else if(c > a && c > b) {
			maxNum = c;
		} else 
			return maxNum;
			
		return maxNum;
	}
	
}
