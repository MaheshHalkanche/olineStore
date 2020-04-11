package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class removeItrdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("bahi");
		al.add("raj");
		al.add("anu");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			String s= itr.next();
			if(s.equals("raj"))			
				itr.remove();				
		}
		System.out.println(al);
		

	}

}
