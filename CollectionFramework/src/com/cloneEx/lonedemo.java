package com.cloneEx;

public class lonedemo implements Cloneable {
	int a = 10;
	int b =20;
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		lonedemo l = new lonedemo();
		System.out.println(l.a);;
		System.out.println(l.b);
		
		lonedemo ll = (lonedemo)l.clone();
		
		System.out.println(ll.a);;
		System.out.println(ll.b);

	}

}
