package com.collSort;

//sorting of id by using normal version
public class Emp implements Comparable {
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Emp e = (Emp)o;
		if(id ==e.id)
			return 0;
		else if(id>e.id)
			return 1;
		else
			return -1;
		//return 0;
	}
	

}
