package com.primeNumbers;

public class MultiplicationTable {
	static void printMultiplicationTable(int input) {
		for(int i=1; i<=10; i++) {
			int mul = i*input;
			System.out.println(input+" * "+i+" = "+mul);
		}
	}
	public static void main(String[] args) {
		int input = 2;
		printMultiplicationTable(input);
	}
}
