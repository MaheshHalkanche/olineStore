package com.vetorEx;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<product> v = new Vector<product>();
		v.add(new product(111, "SAMSUNG", "25000"));
		v.add(new product(222, "LG", "10510"));
		v.add(new product(111, "FAN", "5600"));
		
		//PRINT THE DATA BY USING ENUMERATION CURSOR
		Enumeration<product> e =v.elements();
			while(e.hasMoreElements())
			{
				product p = e.nextElement();
				System.out.println("by using ENUMERATION CURSOR:::::"+p.pid+ " "+ p.pNmae+" "+p.pcost);
			}

			//PRINT THE DATA BY USING ITERATOE CURSOR
		Iterator<product> itr = v.iterator();
		while(itr.hasNext())
		{
			product p =itr.next();
			
			System.out.println("by using ITERATOR CURSOR:::::"+p.pid+ " "+ p.pNmae+" "+p.pcost);
		}
		
		//PRINT THE DATA BY USING LISTITERATOE CURSOR
		
		ListIterator<product> lstr = v.listIterator();
		while(lstr.hasNext())
		{
			product p = lstr.next();
			System.out.println("by using LISTITERATOR CURSOR:::::"+p.pid+ " "+ p.pNmae+" "+p.pcost);
		}
		
	}

}
