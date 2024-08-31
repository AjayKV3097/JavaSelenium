package org.corejava;

public class dumm2 {
	
	public dumm2() {
		
		this(123456781234543l);
		System.out.println("Default");
	}

	public dumm2(long l) {
		// TODO Auto-generated constructor stub
		this('a');
		System.out.println(l);
	}
	public dumm2(char a) {
		System.out.println(a);
	}
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Vijay");

	}
	
public static void main(String[] args) {
	dumm2 d2 = new dumm2();
	//dumm1 d1 = new dumm1();
	d2.m1();
	
	
}
}
