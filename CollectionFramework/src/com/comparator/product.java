package com.comparator;

import com.collSort.Emp;

public class product implements Comparable {
	int id;
	String pname;
	int cost;
	public product(int id, String pname, int cost) {
		super();
		this.id = id;
		this.pname = pname;
		this.cost = cost;
	}
	@Override
	public int compareTo(Object o) {
		product e = (product)o;
		if(id ==e.id)
			return 0;
		else if(id>e.id)
			return 1;
		else
			return -1;
	}
		

}
