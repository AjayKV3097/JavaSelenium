package org.corejava;

public class LoopsAndJumping {

	private void reverseOfNumber() {
		// TODO Auto-generated method stub
		int a = 123;
		int rem = 0;
		int rev;
		while (a > 0) {
			rev = a % 10;// 3
			rem = (rem * 10) + rev;// 3
			a = a / 10;
		}
		System.out.println(rem);
	}

	private void palindromeNumber() {
		// TODO Auto-generated method stub
		int a = 121;
		int rev = 0;
		int rem;
		while (a > 0) {
			rem = a % 10;
			rev = (rev * 10) + rem;
			a = a / 10;
		}

		if (121 == rev) {
			System.out.println("Palindrome");
		}

	}

	private void countNumberOfDigits() {
		// TODO Auto-generated method stub
		int a = 12345;
		int b;
		int c = 0;
		int count = 0;
		while (a > 0) {
			b = a % 10;
			c = b;
			count++;
			a = a / 10;
		}
		System.out.println(count);
	}

	private void countEvenOroddNumberOfDigits() {
		// TODO Auto-generated method stub
		int a = 12345;
		int b;
		int c = 0;
		while (a > 0) {
			b = a % 10;
			c = b;
			if (c % 2 == 0) {
				System.out.println(c + " Its a even");
			} else {
				System.out.println(c + " Its a odd");
			}

			a = a / 10;
		}
	}
	
	private void sumOfDigits() {
		// TODO Auto-generated method stub
		int digit =79432;
		int sum=0;
		int b;
		while(digit>0) {
			b=digit%10;
			sum=sum+b;
			digit=digit/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopsAndJumping l = new LoopsAndJumping();
		l.sumOfDigits();

	}

}
