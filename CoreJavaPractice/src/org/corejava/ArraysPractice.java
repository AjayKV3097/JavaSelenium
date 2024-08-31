package org.corejava;

import java.util.Iterator;

public class ArraysPractice {

	private void sumOfElements() {
		// TODO Auto-generated method stub

		int a[] = { 1, 12, 3, 4, 5 };
		int b = 0;

		for (int i = 0; i < a.length; i++) {
			b = b + a[i];

		}
		System.out.println(b);

	}

	private void evenOrOddNumbersOfElements() {
		// TODO Auto-generated method stub

		int a[] = { 1, 12, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("This is even number:> " + a[i]);
			} else {
				System.out.println("This is odd number:> " + a[i]);
			}

		}

	}

	private void primeNumber() {
		// TODO Auto-generated method stub
		int i = 29;
		int count = 0;

		if (i <= 1) {
			System.out.println("Non Prime number");
		}
		
		for (int j = 1; j <= i / 2; j++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		
		if (count > 1) {
			System.out.println("Non Prime");
		} else {
			System.out.println("Prime");
		}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysPractice a = new ArraysPractice();
		a.primeNumber();
	}

}
