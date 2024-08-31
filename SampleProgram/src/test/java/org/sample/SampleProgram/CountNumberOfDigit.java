package org.sample.SampleProgram;

import java.util.Scanner;

public class CountNumberOfDigit {

	private void countDigits() {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		int i= s1.nextInt();
		int count=0;
		while(i!=0) {
			i=i/10;
			count++;
		}
		System.out.println(count);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNumberOfDigit c = new CountNumberOfDigit();
		c.countDigits();

	}

}
