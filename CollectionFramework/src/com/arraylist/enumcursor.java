package com.arraylist;

import java.util.Enumeration;
import java.util.Vector;

public class enumcursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<String>();
		v.add("mahesh");
		v.add("mahi");
		v.add("manish");
		v.add("somani");
		
		//read the data by using enumeration :normal version	
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			String s = (String)e.nextElement();
			System.out.println(s);
		}
		
		//read the enumration :generic version		
		Enumeration<String> o =v.elements();
		while(o.hasMoreElements())
		{
			String s= o.nextElement();
			System.out.println(s);
			
		}
		
		

	}

}
