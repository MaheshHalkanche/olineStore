package com.comparator;

import java.util.Collections;
import java.util.LinkedList;

import com.collSort.Emp;

public class productSort {
	public static void main(String[] args) {
		LinkedList<product> ll = new LinkedList<product>();
		ll.add(new product(1, "LG", 2500));
		ll.add(new product(2, "MRF", 3500));
		ll.add(new product(3, "SAMSUNG", 4500));
		Collections.sort(ll);
		for(product pp:ll)
		{ 
			System.out.println(pp.id+ " "+pp.pname+" "+pp.cost);
		}
	}

}
