package com.operations.simplenumbers.service;

public interface NumberService {
	
	public String digitAtSpeceficPlace(long number, int pos);

	public String countOfDigits(long number);

	public String largestDigit(long number);

	public String SecondLargestDigit(long number);

	public String kthLargestDigit(long number);

	public String smallestDigit(long number);

	public String secondSmallestDigit(long number);

	public String kthSmallestDigit(long number);

	public String sumOfDigits(long number);

	public String reverseNumber(long number);

	public String sumOfFirstNNumbers(int n);

	public String primeFactorsOfNumber(long number);

	public String fibonacciNumbers(int n);

	public String palindromeNumber(long number);

	public String perfectSquare(long number);

	public String primeOrNot(long number);

	public String circularPrimeOrNot(long number);

	public String divisabilityOfNumber(long number,int divider);

	public String primesSmallerThanNumber(long number);

	public String rotateDigits(long number);

	public String GCD(int a, int b);

	public String LCM(int a, int b);

	public String apSequence(int a,int d,int n);

	public String gpSequence(int a,int r,int n);

}
