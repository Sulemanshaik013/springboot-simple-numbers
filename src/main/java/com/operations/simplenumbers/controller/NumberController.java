package com.operations.simplenumbers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.operations.simplenumbers.service.NumberService;

@RestController
@RequestMapping("/v1/numbers")
public class NumberController {

	@Autowired
	private NumberService service;

	@GetMapping("/digitatspeceficplace")
	public String getDigitAtSpeceficPlace(@RequestParam long number, @RequestParam int pos) {
		return service.digitAtSpeceficPlace(number, pos);
	}

	@GetMapping("/countofdigits")
	public String getCountOfDigits(@RequestParam long number) {
		return service.countOfDigits(number);
	}

	@GetMapping("/largestdigit")
	public String getLargestDigit(@RequestParam long number) {
		return service.largestDigit(number);
	}

	@GetMapping("/secondlargestdigit")
	public String getSecondLargestDigit(@RequestParam long number) {
		return service.SecondLargestDigit(number);
	}

	@GetMapping("/kthlargestdigit")
	public String getKthLargestDigit(@RequestParam long number) {
		return service.kthLargestDigit(number);
	}

	@GetMapping("/smallestdigit")
	public String getSmallestDigit(@RequestParam long number) {
		return service.smallestDigit(number);
	}

	@GetMapping("/secondsmallestdigit")
	public String getSecondSmallestDigit(@RequestParam long number) {
		return service.secondSmallestDigit(number);
	}

	@GetMapping("/kthsmallestdigit")
	public String getKthSmallestDigit(@RequestParam long number) {
		return service.kthSmallestDigit(number);
	}

	@GetMapping("/sumofdigits")
	public String getSumOfDigits(@RequestParam long number) {
		return service.sumOfDigits(number);
	}

	@GetMapping("/reversenumber")
	public String getReverseNumber(@RequestParam long number) {
		return service.reverseNumber(number);
	}

	@GetMapping("/sumoffirstnnnumbers")
	public String getSumOfFirstNNumbers(@RequestParam int n) {
		return service.sumOfFirstNNumbers(n);
	}

	@GetMapping("/primefactors")
	public String getPrimeFactorsOfNumber(@RequestParam long number) {
		return service.primeFactorsOfNumber(number);
	}

	@GetMapping("/fibonacciseries")
	public String getFibonacciNumbers(@RequestParam int n) {
		return service.fibonacciNumbers(n);
	}

	@GetMapping("/palindrome")
	public String getPalindromeNumber(@RequestParam long number) {
		return service.palindromeNumber(number);
	}

	@GetMapping("/perfectsquare")
	public String getPerfectSquare(@RequestParam long number) {
		return service.perfectSquare(number);
	}

	@GetMapping("/prime")
	public String getPrimeOrNot(@RequestParam long number) {
		return service.primeOrNot(number);
	}

	@GetMapping("/circularprime")
	public String getCircularPrimeOrNot(@RequestParam long number) {
		return service.circularPrimeOrNot(number);
	}

	@GetMapping("/divisability")
	public String getDivisabilityOfNumber(@RequestParam long number,@RequestParam int divider) {
		return service.divisabilityOfNumber(number, divider);
	}

	@GetMapping("/primessmaller")
	public String getPrimesSmallerThanNumber(@RequestParam long number) {
		return service.primesSmallerThanNumber(number);
	}

	@GetMapping("/rotatedigits")
	public String getRotateDigits(@RequestParam long number) {
		return service.rotateDigits(number);
	}

	@GetMapping("/gcd")
	public String getGCD(@RequestParam int a, @RequestParam int b) {
		return service.GCD(a, b);
	}

	@GetMapping("/lcm")
	public String getLCM(@RequestParam int a, @RequestParam int b) {
		return service.LCM(a, b);
	}

	@GetMapping("/apsequence")
	public String getApSequence(@RequestParam int firstTerm,@RequestParam int commondifference,@RequestParam int length) {
		return service.apSequence(firstTerm, commondifference, length);
	}

	@GetMapping("/gpsequence")
	public String getGpSequence(@RequestParam int firstTerm,@RequestParam int commonratio,@RequestParam int length) {
		return service.gpSequence(firstTerm, commonratio, length);
	}

}
