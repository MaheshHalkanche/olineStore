package com.treeex;

import java.util.SortedSet;
import java.util.TreeSet;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int i=1; i<= 10; i++)
		{
			t.add(i);			
		}
		System.out.println(t);
		
		SortedSet<Integer> ss = t.subSet(3, 7);
		TreeSet<Integer> tt = new TreeSet<Integer>(ss);
		System.out.println("subSet:::"+tt);
		
		SortedSet<Integer > ts = t.tailSet(4);
		TreeSet<Integer> tss = new TreeSet<Integer>(ts);
		System.out.println("tailSet:::"+ts);
		
		
	SortedSet<Integer> hs =	t.headSet(6);
	TreeSet<Integer> hss = new TreeSet<Integer>(hs);
	System.out.println("headSet:::"+hss);
	}

}
