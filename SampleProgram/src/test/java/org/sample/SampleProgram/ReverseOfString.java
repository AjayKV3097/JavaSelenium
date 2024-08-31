package org.sample.SampleProgram;

import java.util.Scanner;

public class ReverseOfString {

	private void reverseOfString() {
		// TODO Auto-generated method stub
		String s,s4="";
		Scanner s1 = new Scanner(System.in);
		s= s1.nextLine();
		for (int i = 0; i <= s.length()-1; i++) {
			char charAt = s.charAt(i);
			s4=charAt+s4;
			
			
		}
		System.out.println(s4);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseOfString s3 = new ReverseOfString();
		s3.reverseOfString();

	}

}
