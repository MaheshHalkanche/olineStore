package com.arraylist;

import java.util.ArrayList;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//approch-1 :constructor : add one collection into another collection
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		a2.add(20);
		System.out.println(a2);
		
		//approch-2 : addAll() : add more than one collection tnto another collection
		
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(30);		
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		a4.add(40);		
		ArrayList<Integer> a5 = new ArrayList<Integer>();
		a5.addAll(a3);
		a5.addAll(a4);
		a5.add(50);
		
		System.out.println(a5);

	}

}
