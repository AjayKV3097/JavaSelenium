package org.sample.SampleProgram;

public class OccurencesOfString {
	private void stringOccurence() {
		// TODO Auto-generated method stub
		String s  = "I like Mangoes . I like Apples . i am Farmer .";
		
		int count =0;int j;
		String lowerCase = s.toLowerCase();
		String[] word = lowerCase.split(" ");
		
		for (int i = 0; i < word.length; i++) {
			count=1;
			for (j = i+1; j < word.length; j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]=" ";
					
				}
				
			}
			if(!word[i].contentEquals(" ")) {
				System.out.println("the occurences of word : " + word[i]+" "+ count + " times");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OccurencesOfString o = new OccurencesOfString();
		o.stringOccurence();

	}

}
