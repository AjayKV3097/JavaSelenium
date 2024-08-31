package org.sample;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstJavaProgram {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int c = a + b;
		return c;
	}

	private void wrapperClass() {
		// TODO Auto-generated method stub
		String s = "123" ;
		 
		int c = Integer.parseInt(s);
		System.out.println(c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Helloworld");
//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		firstJavaProgram f = new firstJavaProgram();
		//f.add(1, 3);
		f.wrapperClass();
	}

}
