package com.primeNumbers;

public class PrimeNumber {
	
	static boolean checkIfPrimeOrNot(int number) {
		if(number<=1)
			return false;
		if(number == 2)
			return true;
		if(number % 2 == 0)
			return false;
		for(int i=3; i<=Math.sqrt(number); i+=2) {
			if(number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int numb = 11;
		boolean result = checkIfPrimeOrNot(numb);
		if(result)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
