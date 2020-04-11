package com.collSort;

//sorting of ename using generic version of vomparable
public class Empgeneric implements Comparable<Empgeneric> {
	int id;
	String name;
	public Empgeneric(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Empgeneric e) {
		// TODO Auto-generated method stub
		return name.compareTo(name);
	}
	

}
