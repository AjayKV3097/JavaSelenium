package org.corejava;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new LinkedHashSet();
		s.add('d');
		s.add("Ajay");
		s.add(123);
		s.add(12.34F);
		s.add(1234567L);
		
		System.out.println(s);
		
		
		
		s.remove('d');
		System.out.println(s);
		for (Object object : s) {
			System.out.println(object);
		}
	}

}
