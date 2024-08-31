package org.sample.SampleProgram;

import java.util.Scanner;

public class OddOrEven {
	private void checkOddorEven() {
		// TODO Auto-generated method stub
		int i;
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		if(i%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd Number");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddOrEven oe = new OddOrEven();
		oe.checkOddorEven();

	}

}
