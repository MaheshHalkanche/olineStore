package com.serializationx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class empSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<empArraySerialization> al = new ArrayList<empArraySerialization>();
		al.add(new empArraySerialization(11,"mahesh"));
		al.add(new empArraySerialization(12,"girish"));
		al.add(new empArraySerialization(13,"javed"));
		al.add(new empArraySerialization(14,"santosh"));		
		FileOutputStream fis = new FileOutputStream("cde.txt");
		ObjectOutputStream OOS = new ObjectOutputStream(fis);
		OOS.writeObject(al);
		OOS.close();
		System.out.println("serialisation is complete...");
		
		//deserialisation process
		
		FileInputStream fiss = new FileInputStream("cde.txt");
		ObjectInputStream ois = new ObjectInputStream(fiss);
		ArrayList<empArraySerialization> e = (ArrayList<empArraySerialization>)ois.readObject();
		for(empArraySerialization ee:e)
		{
			System.out.println(ee.id+"  "+ee.name);
		}
		ois.close();
		
	
		
		

	}

}
