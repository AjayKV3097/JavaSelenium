package org.sample.SampleProgram;

public class CountOfLowerUpperSpecial {
	private void countOfVowels() {
		// TODO Auto-generated method stub
		int lower=0,upper=0,special=0,number=0;
		String s ="Ajay is a Good candidate@2024";
		String replace = s.replace(" ", "");
		
		for (int i = 0; i < replace.length(); i++) {
			char charAt = replace.charAt(i);
			if(charAt >='0' && charAt <='9') {
			  number++;
				
			}
			if(charAt >='a' && charAt <='z') {
				  lower++;
					
				}
			if(charAt >='A' && charAt <='Z') {
				  upper++;
					
				}
			
		}
		System.out.println("count of numbers is : "+number);
		System.out.println("count of lowercase is : "+lower);
		System.out.println("count of uppercase is : "+upper);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfLowerUpperSpecial c = new CountOfLowerUpperSpecial();
		c.countOfVowels();

	}

}
