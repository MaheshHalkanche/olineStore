package com.arraylist;

import java.util.ArrayList;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Emp(1, "krrish"));
		al.add(new Student(2, "shaktiman"));
		 Object o = al.get(1);
		 if(o instanceof Student)
		 {
			 Student s = (Student)o;
			 System.out.println(s.sId+ " "+s.Sname);
		 }if(o instanceof Emp)
		 {
			 Emp e = (Emp)o;
			 System.out.println(e.empId+" "+e.Ename);
		 }
		 Student s= (Student)al.get(1);
		 System.out.println(s.sId+" "+s.Sname);

	}

}
