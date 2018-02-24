package com.vowelornot;

public class VowelOrNot {
	public boolean isVowel(char letter) {
		boolean check = false;
		letter = Character.toLowerCase(letter);
		
		switch(letter) {
			case 'a': case 'e': case 'i': 
			case 'o': case 'u':
				System.out.println(letter +" is a vowel!");
				check = true;
				break;
			
			default: 
				System.out.println(letter +" is not a vowel!");
		}
		
		return check;
	}
	
	public static void main(String[] args) {
		VowelOrNot v = new VowelOrNot();
		
		v.isVowel('O');
	}
}
