package com.stackEx;

import java.util.Stack;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<String>();
		s.push("mahesh");//3
		s.push("vijay");//2
		s.push("halkanche"); //1  LIFO
		System.out.println(s);
		System.out.println(s.search("mahesh"));
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.empty());
		s.clear();
		System.out.println(s.empty());

	}

}
