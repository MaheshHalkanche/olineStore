package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class test7lstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("mahesh");
		al.add("vijay");
		al.add("halkanche");
		al.add("raj");
		
		ListIterator<String> lstr = al.listIterator();
		lstr.add("akshay");
		while(lstr.hasNext())
		{
			String s = lstr.next();
			//System.out.println("added new string:::"+s);
			if(s.equals("mahesh"))
				lstr.remove();
			if(s.equals("raj"))
				lstr.set("baby");
		}
		System.out.println("added new string:::"+al);

	}

}
