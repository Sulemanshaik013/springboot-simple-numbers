package com.operations.simplenumbers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/numbers")
public class NumberController {

	@GetMapping("/digitatspeceficplace")
	public String digitAtSpeceficPlace(long number, int pos) {
		return null;
	}

	@GetMapping("/countofdigits")
	public String countOfDigits(long number) {
		return null;
	}

	@GetMapping("/largestdigit")
	public String largestDigit(long number) {
		return null;
	}

	@GetMapping("/secondlargestdigit")
	public String SecondLargestDigit(long number) {
		return null;
	}

	@GetMapping("/kthlargestdigit")
	public String kthLargestDigit(long number) {
		return null;
	}

	@GetMapping("/smallestdigit")
	public String smallestDigit(long number) {
		return null;
	}

	@GetMapping("/secondsmallestdigit")
	public String secondSmallestDigit(long number) {

		return null;
	}

	@GetMapping("/kthsmallestdigit")
	public String kthSmallestDigit(long number) {

		return null;
	}

	@GetMapping("/sumofdigits")
	public String sumOfDigits(long number) {

		return null;
	}

	@GetMapping("/reversenumber")
	public String reverseNumber(long number) {

		return null;
	}

	@GetMapping("/sumoffirstnnnumbers")
	public String sumOfFirstNNumbers(int n) {

		return null;
	}

	@GetMapping("/primefactors")
	public String primeFactorsOfNumber(long number) {

		return null;
	}

	@GetMapping("/fibonacciseries")
	public String fibonacciNumbers(int n) {

		return null;
	}

	@GetMapping("/palindrome")
	public String palindromeNumber(long number) {

		return null;
	}

	@GetMapping("/perfectsquare")
	public String perfectSquare(long number) {

		return null;
	}

	@GetMapping("/prime")
	public String primeOrNot(long number) {

		return null;
	}

	@GetMapping("/circularprime")
	public String circularPrimeOrNot(long number) {

		return null;
	}

	@GetMapping("/divisability")
	public String divisabilityOfNumber(long number) {

		return null;
	}

	@GetMapping("/primessmaller")
	public String primesSmallerThanNumber(long number) {

		return null;
	}

	@GetMapping("/rotatedigits")
	public String rotateDigits(long number) {
		return null;
	}

	@GetMapping("/gcd")
	public String GCD(int a, int b) {
		return null;
	}

	@GetMapping("/lcm")
	public String LCM(int a, int b) {
		return null;
	}

	@GetMapping("/apsequence")
	public String apSequence(int n) {
		return null;
	}

	@GetMapping("/gpsequence")
	public String gpSequence(int n) {
		return null;
	}

}
