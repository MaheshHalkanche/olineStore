package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "mahesh", "halkanche"));
		books.add(new Book(111, "Ramayan", "Tulsidas"));
		books.add(new Book(222, "Agnipankh", "Dr.A.P.J.Abdul Kalam"));
		books.add(new Book(333, "Signals and System", "V.Bale"));
		
		Iterator<Book> itr = books.iterator();
		while(itr.hasNext())
		{
			Book b = itr.next();
			if(b.id == 111)
				itr.remove();
			if(b.name.equals("mahesh"))
				itr.remove();
		}
		for(Book bb :books)
		System.out.println(bb.id + "====="+ bb.name +"====="+bb.author);
		
		//ListIterator<String> lstr = books.add(new Book(10, "Mahaharat", "k.roy"));
		
	}

}
