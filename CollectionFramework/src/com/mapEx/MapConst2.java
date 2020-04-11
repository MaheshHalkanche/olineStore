package com.mapEx;

import java.util.TreeMap;

public class MapConst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constructor Approch
		TreeMap<String, Integer> t = new TreeMap<String, Integer>();
		t.put("ratan", 111);
		TreeMap<String, Integer> t2 = new TreeMap<String, Integer>(t);
		t2.put("mahesh", 112);
		System.out.println("t2:::"+t2);
		
		TreeMap<String, Integer> m1 = new TreeMap<String, Integer>();
		m1.put("girish",45);
		
		TreeMap<String, Integer> m2 = new TreeMap<String, Integer>();
		m2.put("manoj",55);
		m2.putAll(m1);
		System.out.println("m2:::"+m2);
		
 
	}

}
