package org.sample.SampleProgram;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class practice {
	private void reverseOfString() {
		// TODO Auto-generated method stub
		String s ="Ajay";
		String s2="";
		int count =0;
		
		StringBuilder s1 = new StringBuilder(s);
		StringBuilder reverse = s1.reverse();
		//System.out.println(reverse);
		for (int i = 0; i <=s.length()-1; i++) {
			char charAt = s.charAt(i);
			count++;
			s2=charAt+s2;			
		}
		System.out.println(s2+count+"times");
		
	}
	private void primeNumber2() {
		// TODO Auto-generated method stub
		int i =3;
		int count=0;
		if(i<=1) {
			System.out.println("Non Prime");
		}
		for (int j = 1; j <i/2; j++) {
			if (i%j==0) {
				
				count++;
			}
				
			}
			if (count>1) {
				System.out.println("non prime");
				
			}
			else {
				System.out.println("Prime");
			}
			
		}

	
	private void vowel() {
		// TODO Auto-generated method stub
		String s ="Ajay";
		String upperCase = s.toUpperCase();
		for (int i = 0; i < upperCase.length(); i++) {
			char charAt = upperCase.charAt(i);
			if(charAt == 'A'||charAt == 'E'||charAt == 'I'||charAt == 'O'||charAt == 'U') {
				System.out.println(charAt+" is a vowel");
			}
			
		}
		

	}
	private void palindrome() {
		// TODO Auto-generated method stub
		String s ="malayalAm";
		String lowerCase = s.toLowerCase();
		StringBuilder s1 = new StringBuilder(lowerCase);
		StringBuilder reverse = s1.reverse();
		if(lowerCase.contentEquals(String.valueOf(reverse))) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}
	private void primeNumber() {
		// TODO Auto-generated method stub
		int i=3,count=0;
		if(i<=1) {
			System.out.println("Its not a prime number");
		}
		for (int j = 1; j < i/2; j++) {
			if(i%j==0) {
				count++;
			}
			
			
		}
		if(count>1) {
			System.out.println("Its not a prime number");
		}
		else {
			System.out.println("Its a prime number");
		}
		

	}
	private void factorial() {
		// TODO Auto-generated method stub
		int i =6,j=1;
		for (int k = 1; k <= i; k++) {
			j=j*k;
			
		}
		System.out.println(j);

	}
	private void arrayDuplicates() {
		// TODO Auto-generated method stub
		int a[]= {10,20,10,30,40};
		LinkedHashSet li = new LinkedHashSet()	;	
		for (int i = 0; i < a.length; i++) {
			li.add(a[i]);
		}
		System.out.println(li);

	}
	private void arrayReverse() {
		// TODO Auto-generated method stub
		Integer a[]= {10,20,10,30,40};
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
		
	}
	private void stringOccurences() {
		// TODO Auto-generated method stub
		String s  = "I like Mangoes . I like Apples . i am Farmer .";
		String lowerCase = s.toLowerCase();
		String[] split = lowerCase.split(" ");
		int count =0;
		for (int i = 0; i < split.length; i++) {
			count=1;
			for (int j = i+1; j < split.length; j++) {
				if(split[i].equals(split[j])) {
					count++;
					split[j]=" ";
				}
				
			}
			if(!split[i].contentEquals(" ")) {
				System.out.println("The character"+split[i]+ " repeated "+count+" times");
				
			}
			
		}

	}
	private void sumOfDigit() {
		// TODO Auto-generated method stub
		int i =1234,j=0,digit=0,count=0;
		while(i>0) {
			digit=i%10;
			j=j+digit;
			i=i/10;
			count++;
			
		}
		System.out.println(j);

	}
	private void occurencesOfEachCharacterInString() {
		// TODO Auto-generated method stub
		String s ="Reshma Raghunath Bangar";
		int count =0;
		String temp="";
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(i)==s.charAt(j)) {
					count++;
					
				}
				
			}
			String valueOf = String.valueOf(s.charAt(i));
			if(!temp.contains(valueOf)) {
				temp = temp +s.charAt(i);
				System.out.println(s.charAt(i)+" "+count);
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice p = new practice();
		//p.reverseOfString();
		//p.vowel();
		//p.palindrome();
		p.primeNumber();
		//p.arrayDuplicates();
		//p.factorial();
		//p.arrayReverse();
		//p.stringOccurences();
		//p.reverseOfString();
		//p.sumOfDigit();
		//p.occurencesOfEachCharacterInString();
	}

}
