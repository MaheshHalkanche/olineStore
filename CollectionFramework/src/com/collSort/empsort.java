package com.collSort;

import java.util.ArrayList;
import java.util.Collections;

public class empsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111,"mahesh"));
		al.add(new Emp(112,"amar"));
		al.add(new Emp(113,"abhay"));
		al.add(new Emp(114,"akshay"));
		
		Collections.sort(al);
		for(Emp ee:al)
		{ 
			System.out.println(ee.id+ " "+ee.name);
		}
		
		ArrayList<Empgeneric> a1 = new ArrayList<Empgeneric>();
		a1.add(new Empgeneric(111,"mahesh"));
		a1.add(new Empgeneric(112,"amar"));
		a1.add(new Empgeneric(113,"abhay"));
		a1.add(new Empgeneric(114,"akshay"));
		
		Collections.sort(al);
		for(Emp ee:al)
		{ 
			System.out.println("Empgeneric:"+ee.id+ " "+ee.name);
		}
		

	}

}
