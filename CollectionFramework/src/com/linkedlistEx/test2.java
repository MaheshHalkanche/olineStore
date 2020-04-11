package com.linkedlistEx;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> ll = new LinkedList<Book>();
		ll.add(new Book(1, "fcp", "s.g.swami"));
		ll.add(new Book(2, "s&s", "V.S.Bale"));
		ll.add(new Book(3, "maths-iv", "s.g.Choudhri"));
		ll.add(new Book(4, "DSP", "solapurkar"));
		
		//Book B1 = 
		
		Iterator<Book> itr = ll.iterator();
		//itr.add(new Book(444, "krrish", "123455"));
		while(itr.hasNext())
		{
			Book b = itr.next();
			//System.out.println(b.id+"===="+b.Bname+"===="+b.prize);
			if(b.Bname.equals("fcp"))
				itr.remove();		
		}
		for(Book bb:ll) {
			System.out.println(bb.id+"===="+bb.Bname+"===="+bb.prize);
			}
		
		ListIterator<Book> lstr = ll.listIterator();
		lstr.add(new Book(1, "khana khanjan", "500"));
		while(lstr.hasNext())
		{
			Book book = lstr.next();
			if(book.Bname.equals("DSP"))
				lstr.remove();
			
		}
		for(Book bb:ll)
		{
			System.out.println(bb.id+"===="+bb.Bname+"===="+bb.prize);
		}
	}

}
