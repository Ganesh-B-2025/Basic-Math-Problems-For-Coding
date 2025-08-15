package com.primeNumbers;

public class SumOfNaturalNumbers {
	static int printNaturalNumbers(int n) {
		int ans = 0;
		for(int i=0; i<=n; i++) {
			ans += i;
		}
		return ans;
	}
	public static void main(String[] args) {
		int n = 3;
		int ans =printNaturalNumbers(n);
		System.out.println(ans);
	}
}
