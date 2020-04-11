package com.arraylist;

import java.util.ArrayList;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al =new ArrayList();
		al.add(10);
		al.add("mahesh");
		al.add(10.5);
		al.add(10.2f);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		al.add(2, "element");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.remove("element");
		System.out.println(al);
		//al.remove(10);
		//System.out.println(al);  //IndexOutOfBoundsException
		
		al.set(1, "krrish");
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
		
		
		ArrayList<Integer> a2 =new ArrayList<Integer>();
		a2.add(1000);
		a2.add(2000);
		
		ArrayList<Integer> a3 =new ArrayList<Integer>(a2);
		a3.add(3000);
		a3.add(4000);
		System.out.println("combo of a3 and a4" + a3);
		

	}

}
