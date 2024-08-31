package org.sample.SampleProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class test01 {
	
	private void reverseOfString() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			
			char c = s1.charAt(i);
			s2=c+s2;
		}
		System.out.println(s2);

	}
	private void vowelsOrConsonants() {
		// TODO Auto-generated method stub
		String s="Ajay is a good boy";
		String replace = s.replace(" ", "");
		String lowerCase = replace.toLowerCase();
		
		for (int i = 0; i < lowerCase.length(); i++) {
			char charAt = lowerCase.charAt(i);
			if(charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u') {
				System.out.println(charAt+" Its a Vowel");
			}
			else {
				System.out.println(charAt+" Its a consonant");
			}
			
		}

	}
	private void prime() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 int i = 71;

		    // Holds the count of values
		    int count = 0;

		    // There is no prime number less than 2.
		    if (i <= 1) {
		      System.out.println("The number is not prime");
		      return;
		    }

		    // Do a for loop
		    for (int j = 1; j <= i / 2; j++) {
		      if (i % j == 0) {
		        count++;
		      }
		    }

		    // If the number of factors is greater than 1,
		    // the number is not prime.
		    if (count > 1) {
		        System.out.println("The number is not prime");
		    }
		    else {
		      System.out.println("The number is prime "+i);
		    }
		  }
		

	private void sumOfDigit() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int digit,count=0;
		while(i>0) {
			digit=i%10;
			count =count+digit;
			i=i/10;
		}
		System.out.println(count);

	}
	private void checkStringIsPalindrome() {
		// TODO Auto-generated method stub
		String s1 ="malayalaam";
		StringBuilder s = new StringBuilder(s1);
		StringBuilder reverse = s.reverse();
		if (s1.equalsIgnoreCase(String.valueOf(reverse))) {
			System.out.println("Palindrome");
			
			
		}
		else {
			System.out.println("Not Palindrome");
		}
		

	}
	private void factorial() {
		// TODO Auto-generated method stub
		int i=5,k=1;
		for (int j = 1; j<=i; j++) {
			
			k=k*j;
			
		}
		System.out.println(k);
	}
	private void duplicatesOfArray() {
		// TODO Auto-generated method stub
		int a[]= {10,20,10,30,40};
		LinkedHashSet l = new LinkedHashSet();
		for (int i = 0; i < a.length; i++) {
			l.add(a[i]);
			
		}
		System.out.println(l);

	}
	private void reverseOfArray() {
		// TODO Auto-generated method stub
		Integer a[]= {10,20,10,30,40};
		Collections.reverse(Arrays.asList(a));	
		System.out.println(Arrays.asList(a));
		LinkedHashSet li =new LinkedHashSet();
		li.addAll(Arrays.asList(a));
		System.out.println(li);
		Arrays.sort(a,Collections.reverseOrder());//descending
		System.out.println(Arrays.toString(a));

	}
	
	private void array() {
		// TODO Auto-generated method stub
		//remove duplicate 
		Integer a[]= {10,20,10,30,40};
		LinkedHashSet li = new LinkedHashSet();	
		li.addAll(Arrays.asList(a));
		System.out.println(li);
		//reverse
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
		//sorting in desc
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test01 t = new test01();
		t.array();
		
		//t.reverseOfArray();
		//t.duplicatesOfArray();
		//t.factorial();
		//t.checkStringIsPalindrome();
		//t.prime();
		//t.sumOfDigit();
		//t.reverseOfString();
		//t.vowelsOrConsonants();
//		String s = "Ajay";
//		StringBuilder s1 = new StringBuilder(s);
//		StringBuilder reverse = s1.reverse();
//		System.out.println(reverse);
//		int count=0;
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		driver.manage().window().maximize();
//		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
//		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//		Actions a = new Actions(driver);
//		a.dragAndDrop(source, target).perform();
//		driver.close();
	}

	}


