package org.corejava;

public class dumm1 extends dumm2 {

	public dumm1 () {
		this("Ajay");
		System.out.println("Default Constructor-1");
	}

	public dumm1(String string) {
		// TODO Auto-generated constructor stub
		this(123);
		System.out.println(string);
	}

	public dumm1(int i) {
		super();
		System.out.println(i);
	}
	

}
