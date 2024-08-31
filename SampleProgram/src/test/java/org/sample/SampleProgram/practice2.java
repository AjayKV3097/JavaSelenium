package org.sample.SampleProgram;

import java.util.Iterator;

public class practice2 {
	
	private void reverseOfString() {
		// TODO Auto-generated method stub
		String s ="Ajay",s2="";
		StringBuilder s1 = new StringBuilder(s);
		StringBuilder reverse = s1.reverse();
		System.out.println(reverse);
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			s2=charAt+s2;
		}
		System.out.println(s2);
	}
	private void primeNumber() {
		// TODO Auto-generated method stub
		int i=3,count=0;
		if(i<=1) {
			System.out.println("Its not a prime");
		}
		for (int j = 1; j<i/2 ; j++) {
			count++;
			if(i%j==0) {
				count++;
			}
			
		}
		if (count>1) {
			System.out.println("Its not a prime");
			
		}
		else {
			System.out.println("Its a prime");
		}

	}
	private void palindrome() {
		// TODO Auto-generated method stub
		String s = "Madaam";
		String lowerCase = s.toLowerCase();
		StringBuilder s1 = new StringBuilder(lowerCase);
		StringBuilder reverse = s1.reverse();
		if(reverse.toString().equals(lowerCase)) {
			System.out.println("Its a Palindrome");
		}

	}
	private void factorial() {
		// TODO Auto-generated method stub
		int i=5;int j = 1;
		for (int k = 1; k <=i; k++) {
			j=j*k;
			
		}
		System.out.println(j);
		

	}
	private void occurencesOfString() {
		// TODO Auto-generated method stub
		String s  = "I like Mangoes . I like Apples . i am Farmer .";
		
		int count=0,j=0;
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			count=1;
			for (int k = i+1; k < split.length; k++) {
				if(split[i].equals(split[k])) {
					count++;
					split[k]=" ";
				}
				
			}
			if(!split[i].equals(" ")) {
				System.out.println(split[i] + " repeated " +count+" times ");
			}
			
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice2 p2 = new practice2();
		p2.occurencesOfString();

	}

}
