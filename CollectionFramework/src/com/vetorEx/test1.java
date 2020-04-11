package com.vetorEx;

import java.util.ArrayList;
import java.util.Vector;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("mahi");
		al.add("bbb");
		Vector<String > v = new Vector<String>(al);
		//System.out.println(v.capacity());
		v.add("mahesh");
		v.add("girish");
		v.add("sam");
		System.out.println(v);
		//System.out.println(v.capacity());

	}

}
