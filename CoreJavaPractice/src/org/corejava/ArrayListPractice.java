package org.corejava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	
	
	
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add('d');
		li.add("Ajay");
		li.add(123);
		li.add(12.34F);
		li.add(1234567L);
		
		System.out.println(li);
		
		li.add(3, 123456789.234567d);
		System.out.println(li);
		System.out.println(li.indexOf(123));
		li.remove(0);
		System.out.println(li);
		for (Object object : li) {
			System.out.println(object);
		}
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		List li2 = new ArrayList();
		li2.addAll(li);
		System.out.println(li2);
}
}