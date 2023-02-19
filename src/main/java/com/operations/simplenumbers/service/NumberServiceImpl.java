package com.operations.simplenumbers.service;

import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {

	@Override
	public String digitAtSpeceficPlace(long number, int pos) {
		int base=10;
		int digit= (int) ((number/Math.pow(base,pos-1))%base);
		String result="the digit at position "+pos+ "in number "+number +" is "+digit;
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
		return null;
	}

	@Override
	public String largestDigit(long number) {
		long large = 0;
		while (number != 0) {
			long res = number % 10;
			if (res > large) {
				large = res;
			}
			number = number / 10;
		}
		String result="Largest digit in number " + number + " is " + large;
		return null;
	}

	@Override
	public String SecondLargestDigit(long number) {
		long large = 0, secondLarge = 0;
		while (number != 0) {
			long res = number % 10;
			if (res > large) {
				secondLarge = large;
				large = res;
			} else if (secondLarge <= res) {
				secondLarge = res;
			}
			number = number / 10;
		}
		String result="Second Largest digit in number " + number + " is " + secondLarge;
		return null;
	}

	@Override
	public String kthLargestDigit(long number) {
		return null;
	}

	@Override
	public String smallestDigit(long number) {
		long small = 9;
		while (number != 0) {
			long res = number % 10;
			if (res > small) {
				small = res;
			}
			number = number / 10;
		}
		String result="smallest digit in number " + number + " is " + small;
		return null;
	}

	@Override
	public String secondSmallestDigit(long number) {
		long small = 9, secondSmall = 9;
		while (number != 0) {
			long res = number % 10;
			if (res < small) {
				secondSmall = small;
				small = res;
			} else if (secondSmall >= res) {
				secondSmall = res;
			}
			number = number / 10;
		}
		String result="smallest digit in number " + number + " is " + secondSmall;
		return null;
	}

	@Override
	public String kthSmallestDigit(long number) {

		return null;
	}

	@Override
	public String sumOfDigits(long number) {
		long sum = 0;
		while (number != 0) {
			long res = number % 10;
			sum = sum + res;
			number = number / 10;
		}
		String result="Sum of digits in number " + " is " + sum;
		return null;
	}

	@Override
	public String reverseNumber(long number) {
		long rev = 0;
		while (number != 0) {
			long res = number % 10;
			rev = rev * 10 + res;
			number = number / 10;
		}
		String result="Largest digit in number " + number + " is " + rev;
		return null;
	}

	@Override
	public String sumOfFirstNNumbers(int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=n;
		}
		System.out.format("Sum is of first %d numbers is %d",n,sum);
		return null;
	}

	@Override
	public String primeFactorsOfNumber(long number) {

		return null;
	}

	@Override
	public String fibonacciNumbers(int n) {
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		return null;
	}

	@Override
	public String palindromeNumber(long number) {
		long rev = 0,temp=number;
		while (number != 0) {
			long res = number % 10;
			rev = rev * 10 + res;
			number = number / 10;
		}
		if(rev==temp) {
			String result="palindrome";
		}else {
			String result="not pallindrome";
		}
		return null;
	}

	@Override
	public String perfectSquare(long number) {
		int squareRootofNumber=(int) Math.sqrt(number);
		if((squareRootofNumber*squareRootofNumber)==number) {
			String result="perfect Square";
		}
		else {
			String result="not a perfect square";
		}
		return null;
	}

	@Override
	public String primeOrNot(long number) {
		boolean flag = false;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				flag=true;
			}
		}
		if (!flag) {
			String result="prime";
		} else {
			String result="not prime";
		}
		return null;
	}

	@Override
	public String circularPrimeOrNot(long number) {

		return null;
	}

	@Override
	public String divisabilityOfNumber(long number) {

		return null;
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
		return null;
	}

	@Override
	public String LCM(int a, int b) {
		return null;
	}

	@Override
	public String apSequence(int n) {
		return null;
	}

	@Override
	public String gpSequence(int n) {
		return null;
	}

}
