package com.primeNumbers;

public class CheckEvenOrOdd {
	
	static boolean isEvenorOdd(int number) {
		if(number % 2 == 0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		int number = 198;
		boolean isEvenorOdd = isEvenorOdd(number);
		if(isEvenorOdd)
			System.out.println(number+" is Even Number");
		else
			System.out.println(number+" is Odd Number");
	}
}
