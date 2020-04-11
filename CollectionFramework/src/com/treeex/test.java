package com.treeex;

import java.util.Comparator;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<product> t = new TreeSet<product>(new test2());
		t.add(new product(2,"samsung", 10.5));
		t.add(new product(4,"LG", 80.5));
		t.add(new product(7,"Redmi", 20.5));
		t.add(new product(5,"Apple", 1054.5));
		
		for(product p:t)
		{
			System.out.println(p.id+"    "+p.name+"  "+p.cost);
		}

	}

}

class test2 implements Comparator<product>
{

	@Override
	public int compare(product o1, product o2) {
		// TODO Auto-generated method stub
		
		
		return - o1.name.compareTo(o2.name);
	}
}
