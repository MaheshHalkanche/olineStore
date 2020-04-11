package com.mapEx;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> t = new TreeMap<Integer, String>();
		t.put(1, "mahesh");
		t.put(2, "ilas");
		t.put(3, "java");
		System.out.println(t);
		
		TreeMap<String,Integer> tt = new TreeMap<String, Integer>();
		tt.put("mahesh",1);
		tt.put("vilas",2);
		tt.put("java",3);
		System.out.println(tt);

	}

}
