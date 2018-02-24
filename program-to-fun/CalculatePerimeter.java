package com.perimeterwitharea;

public class CalculatePerimeter {
	public int findPerimeter(int area) {
		int side = area/2;
		
		int perimeter = 4 * side;
		
		return perimeter;
	}
	
	public static void main(String[] args) {
		CalculatePerimeter p = new CalculatePerimeter();
		
		System.out.println("The perimeter of this Square is: " +p.findPerimeter(4));
	}
}
