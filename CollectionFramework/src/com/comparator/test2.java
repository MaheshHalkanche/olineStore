package com.comparator;

import java.util.Collections;
import java.util.LinkedList;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<product> ll = new LinkedList<product>();
		ll.add(new product(1, "samsung", 120345));
		ll.add(new product(2, "LG", 120));
		ll.add(new product(3, "PEN", 345));
		Collections.sort(ll,new PidSort());
		for(product e:ll)
		{
			System.out.println("sort by id:::"+e.id+" "+e.pname+" "+e.cost);
		}
		
		Collections.sort(ll,new pnamecomp());
		for(product e:ll)
		{
			System.out.println("sort by pname::"+e.id+" "+e.pname+" "+e.cost);
		}
		

	}

}
