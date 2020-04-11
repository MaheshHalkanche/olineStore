package com.linkedlistEx;

import java.util.LinkedList;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("mahesh");
		ll.add("manoj");
		ll.add(null);
		System.out.println(ll);
		
		ll.addFirst("mahi");
		ll.addLast("sehwag");
		System.out.println("aftr adding data:::"+ll);
		System.out.println(ll.size());
		System.out.println(ll.set(1,"somani"));
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll.isEmpty());
		ll.clear();
		System.out.println(ll.isEmpty());
	}

}
