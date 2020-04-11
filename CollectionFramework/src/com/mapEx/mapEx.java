package com.mapEx;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class mapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h = new HashMap<Integer, String>();
		h.put(1,"mahesh");
		h.put(12,"vilas");
		h.put(19,"sunil");
		h.put(14,"santosh");
		h.put(8,"santosh");
		System.out.println(h);
		
	Set<Integer> S=	h.keySet();
	System.out.println("keys:::"+S);
	
	Collection<String> c = h.values();
	System.out.println("valuse:::"+c);
	
	Set<Entry<Integer, String>> s =h.entrySet();
	for(Entry<Integer,String> e:s)
	{
		System.out.println("all key and value:::"+e.getKey()+"==="+e.getValue());
	}
	
	
	

		

	}

}
