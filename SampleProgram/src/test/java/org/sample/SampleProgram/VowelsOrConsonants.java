package org.sample.SampleProgram;

import java.util.Scanner;

public class VowelsOrConsonants {
	private void vowel() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine().replace(" ","");
		String lowerCase = s1.toLowerCase();
		for (int i = 0; i < s1.length(); i++) {
		  char charAt = lowerCase.charAt(i);
			if(charAt=='a'|| charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u') {
				System.out.println(charAt+"Its a vowel");
			}

			else {
				System.out.println(charAt+"Its a consonant");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelsOrConsonants v = new VowelsOrConsonants();
		v.vowel();
		
	}

}
