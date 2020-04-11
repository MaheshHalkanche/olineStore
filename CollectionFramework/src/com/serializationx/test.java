package com.serializationx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class test  {
	void SerialsionDemo() throws IOException
	{
		Emp e = new Emp(1, "mahesh");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream Oos = new ObjectOutputStream(fos);
		Oos.writeObject(e);
		System.out.println("serialisation is completed...");
		
	}
	void desrialization() throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e = (Emp)ois.readObject();
		System.out.println("deserialisation::"+e.id+"   "+e.name);
		ois.close();
		
		
	}

	public static void main(String[] args)  throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		test t = new test();
		t.SerialsionDemo();
		t.desrialization();

	}

}
