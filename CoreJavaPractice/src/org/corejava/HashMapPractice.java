package org.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {
	
	public void HashMapPractice1() {
		// TODO Auto-generated constructor stub
		
		HashMap<Integer,String> m = new HashMap<Integer,String>();	
		m.put(100, "Police");
		m.put(101, "Lawyer");
		m.put(101, "Doctor");
		m.put(103, "Lawyer");
		m.put(104, "Police");
		
		System.out.println(m.get(102));
		Set<Integer> keySet = m.keySet();
		for (Integer i : keySet) {
			System.out.println(i);
		}
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		List li = new ArrayList(entrySet);
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).toString());
			String string = li.get(i).toString();
			if(string.equalsIgnoreCase("100=Police")|| string.equals("101=Doctor")) {
			System.out.println(string);
		}
		}
		}
	
	public static void main(String[] args) {
		HashMapPractice h = new HashMapPractice();
		h.HashMapPractice1();
	}
	
	
	
	
	
	

}
