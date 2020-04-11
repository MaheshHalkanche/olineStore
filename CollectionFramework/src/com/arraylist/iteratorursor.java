package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("mahesh");
		al.add("vijay");
		al.add("girish");
		al.add("halkanche");
		al.add("deepa");
		
		
		//read the  data by using iterator : normal version
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
					System.out.println(s);			
			//System.out.println(itr.next());
		}
		
		//read the  data by using iterator : generic version
		
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext())
		{
			String s = itr1.next();
			System.out.println(s);
		}
		

	}

}
