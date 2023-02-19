package com.operations.simplenumbers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {

	@Override
	public String digitAtSpeceficPlace(long number, int pos) {
		int base = 10;
		int digit = (int) ((number / Math.pow(base, pos - 1)) % base);
		String result = "the digit at position " + pos + " in number " + number + " is " + digit;
		return result;
	}

	@Override
	public String countOfDigits(long number) {
		int cnt = 0;
		long temp = number;
		while (temp != 0) {
			temp = temp / 10;
			cnt++;
		}
		String result = "The count of digits in number " + number + " is " + cnt;
		return result;
	}

	@Override
	public String largestDigit(long number) {
		long large = 0;
		long temp = number;
		while (number != 0) {
			long res = temp % 10;
			if (res > large) {
				large = res;
			}
			temp = temp / 10;
		}
		String result = "Largest digit in number " + number + " is " + large;
		return result;
	}

	@Override
	public String SecondLargestDigit(long number) {
		long large = 0, secondLarge = 0;
		long temp = number;
		while (temp != 0) {
			long res = temp % 10;
			if (res > large) {
				secondLarge = large;
				large = res;
			} else if (secondLarge <= res) {
				secondLarge = res;
			}
			temp = temp / 10;
		}
		String result = "Second Largest digit in " + number + " is " + secondLarge;
		return result;
	}

	@Override
	public String kthLargestDigit(long number) {
		return null;
	}

	@Override
	public String smallestDigit(long number) {
		long small = 9;
		long temp = number;
		while (temp != 0) {
			long res = temp % 10;
			if (res < small) {
				small = res;
			}
			temp = temp / 10;
		}
		String result = "smallest digit in " + number + " is " + small;
		return result;
	}

	@Override
	public String secondSmallestDigit(long number) {
		long small = 9, secondSmall = 9;
		long temp = number;
		while (temp != 0) {
			long res = temp % 10;
			if (res < small) {
				secondSmall = small;
				small = res;
			} else if (secondSmall >= res) {
				secondSmall = res;
			}
			temp = temp / 10;
		}
		String result = "Second smallest digit in " + number + " is " + secondSmall;
		return result;
	}

	@Override
	public String kthSmallestDigit(long number) {

		return null;
	}

	@Override
	public String sumOfDigits(long number) {
		long sum = 0;
		long temp = number;
		while (temp != 0) {
			long res = temp % 10;
			sum = sum + res;
			temp = temp / 10;
		}
		String result = "Sum of digits in " + number + " is " + sum;
		return result;
	}

	@Override
	public String reverseNumber(long number) {
		long rev = 0;
		long temp = number;
		while (temp != 0) {
			long res = temp % 10;
			rev = rev * 10 + res;
			temp = temp / 10;
		}
		String result = " reverse of " + number + " is " + rev;
		return result;
	}

	@Override
	public String sumOfFirstNNumbers(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i;
		}
		String result = "Sum is of first " + n + " numbers is " + sum;
		return result;
	}

	@Override
	public String primeFactorsOfNumber(long number) {

		return null;
	}

	@Override
	public String fibonacciNumbers(int n) {
		int n1 = 0, n2 = 1, n3;
		List<Integer> series = new ArrayList<>();
		series.add(n1);
		series.add(n2);
		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			series.add(n3);
			n1 = n2;
			n2 = n3;
		}
		return "the fibonacci series for " + n + " is " + series.toString();
	}

	@Override
	public String palindromeNumber(long number) {
		long rev = 0, temp = number;
		String result;
		while (temp != 0) {
			long res = temp % 10;
			rev = rev * 10 + res;
			temp = temp / 10;
		}
		if (rev == number) {
			result = number + " is a palindrome number";
		} else {
			result = number + " is a not palindrome number";
		}
		return result;
	}

	@Override
	public String perfectSquare(long number) {
		String result;
		int squareRootofNumber = (int) Math.sqrt(number);
		if ((squareRootofNumber * squareRootofNumber) == number) {
			result = number + " is a perfect Square";
		} else {
			result = number + " is not a perfect square";
		}
		return result;
	}

	@Override
	public String primeOrNot(long number) {
		boolean flag = false;
		String result;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				flag = true;
			}
		}
		if (!flag) {
			result = number + " is a prime number";
		} else {
			result = number + " is not a prime number";
		}
		return result;
	}

	@Override
	public String circularPrimeOrNot(long number) {

		return null;
	}

	@Override
	public String divisabilityOfNumber(long number, int divider) {
		String result;
		if (number % divider == 0) {
			result = "the number " + number + " is divisible by" + divider;
		} else {
			result = "the number " + number + " is not divisible by" + divider;

		}

		return result;
	}

	@Override
	public String primesSmallerThanNumber(long number) {

		return null;
	}

	@Override
	public String rotateDigits(long number) {
		return null;
	}

	@Override
	public String GCD(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		String result = "the gcd of " + a + "," + b + " is " + gcd;
		return result;
	}

	@Override
	public String LCM(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		int lcm = (a * b) / gcd;
		String result = "the lcm of " + a + "," + b + " is " + lcm;
		return result;
	}

	@Override
	public String apSequence(int a,int d,int n) {
		int currentTerm=a;
		List<Integer> series = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			series.add(currentTerm);
			currentTerm=currentTerm+d;
		}
		return "the ap series for first term" + a +"common difference "+d+ "of length "+n+ " is " + series.toString();
	}

	@Override
	public String gpSequence(int a,int r,int n ) {
		int currentTerm=a;
		List<Integer> series = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			series.add(currentTerm);
			currentTerm= currentTerm* (int) Math.pow(r, i);
		}
		return "the gp series for first term" + a +"common ratio "+r+ "of length "+n+ " is " + series.toString();
		}

}
