package com.mapEx;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap1 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<Integer, String>();
		map.put(11,"mahesh");
		map.put(15,"mahesh");
		map.put(13,"mahesh");
		map.put(14,"mahesh");
		//System.out.println(map);
		
		for(Map.Entry m :map.entrySet())
		{
			System.out.println("Before removing the element:::"+m.getKey()+"   "+m.getValue());
		}
		map.remove(11);
		for(Map.Entry m :map.entrySet())
		{
			System.out.println("After  removing the element:::"+m.getKey()+"   "+m.getValue());
		}
		
		NavigableMap<Integer,String> nav= new TreeMap<Integer, String>();
		
		nav.put(11,"mahesh");
		nav.put(9,"mahesh");
		nav.put(13,"mahesh");
		nav.put(14,"mahesh");
		
		System.out.println("descending map:::"+nav.descendingMap());
		//Returns key-value pairs whose keys are less than or equal to the specified key. 
		System.out.println("headMap:::"+nav.headMap(11,true));
		
		
	}

}
