package com.calcinterest;

public class CalculateInterest {
	public CalculateInterest(double deposit) {
		double interest;
		double result;
		
		if(deposit <= 0 && deposit < 1000) {
			interest = deposit * 0.04;
			result = deposit + interest;
			System.out.println("Total Amount to be received after an year is: "+result);
		} else if(deposit >= 1000 && deposit < 5000) {
			interest = deposit * 0.045;
			result = deposit + interest;
			System.out.println("Total Amount to be received after an year is: "+result);
		} else {
			interest = deposit * 0.05;
			result = deposit + interest;
			System.out.println("Total Amount to be received after an year is: "+result);
		}
	}
	
	public static void main(String[] args) {
		new CalculateInterest(4000);
	}
}