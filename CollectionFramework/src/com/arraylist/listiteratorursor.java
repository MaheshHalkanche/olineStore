package com.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class listiteratorursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("manoj");
		al.add("mahesh");
		al.add("krrish");
		al.add("jehalal");
		ListIterator iterator =al.listIterator();
		
		//listIterator cursor : with normal version: print the data forward direction
		while(iterator.hasNext())
		{
		String string =	(String)iterator.next();
		System.out.println(string);		
		
		}
		
		//listIterator cursor : with normal version: print the data bakword direction
		
		while(iterator.hasPrevious())
		{
		String string =	(String)iterator.previous();
		System.out.println("previos cursor:::"+ string);
		}
		
		
		//listIterator cursor : with generic version: print the data forward & bakword direction
		
		ListIterator<String> itr =al.listIterator();
		while(itr.hasNext())
		{
		String string =	itr.next();
		System.out.println("forward cursor generi::::"+string);			
		}
		
		while(itr.hasPrevious())
		{
		String string =	itr.previous();
		System.out.println("previos cursor generi:::"+ string);
		}
		
		
		

	}

}
