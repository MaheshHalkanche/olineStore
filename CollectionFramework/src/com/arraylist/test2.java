package com.arraylist;

import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arrays are type safe
		int[] a = {12,2,3,40,50};
		for(int i:a)
		{
			System.out.println(i);
		}
		//ollections are not type safe
		ArrayList al = new ArrayList();
		al.add(new Emp(111,"mahesh"));
		for(Object object : al)
		{
			if(object instanceof Emp)
			{
				Emp e =(Emp)object;
				System.out.println(e.empId+"  "+e.Ename);
			}
		}
		
		Object oo =al.get(0);
		if(oo instanceof Emp)
		{
			Emp ee =(Emp)oo;
			System.out.println(ee.empId+" "+ ee.Ename);
		}
		
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.add(new Emp(10,"mahi"));
		for(Emp e:a2)
		{
			System.out.println("type safety:::"+ e.empId+ "  "+e.Ename);
		}
		
		Emp e2 = a2.get(0);
		
		System.out.println("index value:::"+ e2.empId+ " "+ e2.Ename);

	}

}
