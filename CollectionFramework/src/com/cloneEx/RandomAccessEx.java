package com.cloneEx;

import java.util.ArrayList;

public class RandomAccessEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("mahesh");
		al.add("vijay");
		al.add("girish");
		al.add("halkanche");
		
		ArrayList<String> copy =(ArrayList<String>)al.clone();
		System.out.println(copy);

	}

}
