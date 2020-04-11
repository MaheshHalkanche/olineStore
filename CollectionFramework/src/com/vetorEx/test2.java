package com.vetorEx;

import java.util.Iterator;
import java.util.Vector;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		for(int i =0; i<=30; i++)
		{
			v.add(i);
			/*
			 * if(i%2 ==0) { System.out.println("even::"+i); }else {
			 * System.out.println("odd:::"+i); }
			 */
		}
		
		
		Iterator<Integer> iterator = v.iterator();
		while(iterator.hasNext())
		{
			Integer i = iterator.next();
			if(i%2==0)
				System.out.println("============"+ i);
			else
				iterator.remove();
		}
		System.out.println(v);

	}

}
