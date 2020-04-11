package com.mapEx;

import java.util.Map;
import java.util.TreeMap;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book> book = new TreeMap<Integer, Book>();
		Book b1 = new Book(10, "CPP", "S.G.Swami", 120);
		Book b2 = new Book(11, "java", "tandle", 180);
		Book b3 = new Book(12, "python", "kamble G.V.", 120);
		Book b4 = new Book(13, "devoops", "R.Sudke", 135);
		
		book.put(2,b2);  
		book.put(1,b1);  
		book.put(3,b3);  
		
		for(Map.Entry<Integer, Book> entry:book.entrySet()){    
	        int key=entry.getKey();  
	        Book b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.author+" "+b.quentity);   
	    } 

	}

}
