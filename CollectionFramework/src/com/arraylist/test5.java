package com.arraylist;

import java.util.ArrayList;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1 = new Emp(111,"mahesh");
		Emp e2 = new Emp(222,"bhagi");
		Emp e3 = new Emp(333,"shree");
		Emp e4 = new Emp(444,"durga");
		
		ArrayList<Emp> a1 = new ArrayList<Emp>(); // a1 is object
		a1.add(e1);
		a1.add(e2);
		
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.addAll(a1);
		a2.add(e3);
		a2.add(e4);
		
		/*
		 * System.out.println(a2.contains(e1)); System.out.println(a2.containsAll(a1));
		 * a2.remove(e1); System.out.println("remove::"+a2.contains(e1));
		 * System.out.println(a2.containsAll(a1));
		 */
		//a2.removeAll(a1);// all a1 objects are removed
		a2.retainAll(a1);
		
		for(Emp e:a2)
		{
			System.out.println(e.empId+ " "+ e.Ename);
		}
		
	}

}
