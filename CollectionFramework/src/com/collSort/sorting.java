package com.collSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("mahesh");
		al.add("vijay");
		al.add("sam");
		al.add("shital");
		System.out.println("before sort:::"+al);
		Collections.sort(al);
		System.out.println("after sort:::"+al);
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(00);
		ll.add(5);
		ll.add(1);
		
		System.out.println("before sort:::"+ll);
		Collections.sort(ll);
		System.out.println("after sort:::"+ll);
		
		//case 2
		ArrayList a1 = new ArrayList(); 
		a1.add(10);
		a1.add("example"); //java.lang.ClassCastException
		//a1.add(null);
		System.out.println("before sort:::"+a1);
		Collections.sort(a1);
		System.out.println("after sort:::"+a1);
		
		//case 3
		
				ArrayList a2 = new ArrayList(); 
				a2.add(10);
				//a1.add("example"); 
				a2.add(null); //java.lang.NullPointerException
				System.out.println("before sort:::"+a2);
				Collections.sort(a2);
				System.out.println("after sort:::"+a2);

	}

}

