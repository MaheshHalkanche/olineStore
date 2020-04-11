package com.arraylist;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(new Emp(10, "mahesh"));
		al.add(new Student(11, "raj"));
		al.add(10);
		al.add(null);
		for (Object object : al) {
			//System.out.println(object);
			if(object instanceof Emp)
			{
				Emp e =(Emp)object;
				System.out.println(e.empId + "  " + e.empId);
				
			}if(object instanceof Student)
			{
				Student s=(Student)object;
				System.out.println(s.sId + "  "+ s.Sname);
			} if(object instanceof Integer)
			{
				System.out.println(object);
			}if(object == null)
			{
				System.out.println(object);
			}
			
		}
		

	}

}
