package com.mapEx;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class productTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, product> h= new LinkedHashMap<Integer, product>();
		h.put(1,new product(11, "samsung", 25.5));
		h.put(2,new product(13, "lg", 35.4));
		h.put(3,new product(15, "fan", 26.5));
		h.put(4,new product(16, "radio", 32.54));
		
		//approch 1
		
		Set<Entry<Integer,product>> hh=h.entrySet();
		Iterator<Entry<Integer, product>>  itr = hh.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, product> entry =  itr.next();
			product pp = entry.getValue();
			if(pp.id ==13)
				itr.remove();
			
			if(pp.pname.equals("fan"))
				itr.remove();
		}
		for(Entry<Integer, product> e1:h.entrySet())
		{
			product p = e1.getValue();
			System.out.println(p.id+"++++++"+p.pname+"+++++"+p.cost);
		}
		
		//Approch 2
		for(Map.Entry<Integer, product> e:h.entrySet())
		{
			int key = e.getKey();
			product p = e.getValue();
			System.out.println(p.id+"===="+p.pname+"===="+p.cost);
		}
		
		

	}

}
