package com.primeNumbers;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int firstNumber = 10;
		int secondNumber = 20;
		System.out.println("Before Swapping");
		System.out.println("First Number: "+firstNumber);
		System.out.println("SecondNumber: "+secondNumber);

		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;

		//without using third variable
//		firstNumber = firstNumber^secondNumber;
//		secondNumber = firstNumber^secondNumber;
//		firstNumber = secondNumber^firstNumber;
		
		System.out.println("After Swapping");
		System.out.println("First Number: "+firstNumber);
		System.out.println("SecondNumber: "+secondNumber);
	}
}
