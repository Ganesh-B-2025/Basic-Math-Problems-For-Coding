package com.primeNumbers;

public class SumofSquaresofNaturals {
	
	static int findSuare(int n) {
		return n*n;
	}
	static int sumofSquaresofNaturals(int n) {
		int ans = 0;
		for(int i=0; i<=n; i++) {
			int squares = findSuare(i);
			ans += squares;
		}
		return ans;
	}
	public static void main(String[] args) {
		int number = 2;
		int ans = sumofSquaresofNaturals(number);
		System.out.println(ans);
	}
}
