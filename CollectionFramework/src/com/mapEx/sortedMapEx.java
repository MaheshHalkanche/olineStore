package com.mapEx;

import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> t = new TreeMap<Integer, String>();
		t.put(10,"mahesh");
		t.put(5,"mahesh");
		t.put(15,"mahesh");
		t.put(16,"mahesh");
		t.put(1,"mahesh");
		t.put(8,"mahesh");
		t.put(29,"mahesh");
		System.out.println(t);
		
		SortedMap<Integer, String> ss = t.subMap(8, 30);
		TreeMap<Integer,String> tt = new TreeMap<Integer, String>(ss);
		System.out.println(tt);
		
		
		SortedMap<Integer, String> tm = t.tailMap(15);
		TreeMap<Integer,String> tmm = new TreeMap<Integer, String>(tm);
		System.out.println("tail map:::"+tmm);
		

	}

}
