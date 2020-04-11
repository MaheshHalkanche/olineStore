package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(11, "mahesh"));
		al.add(new Emp(11, "mani"));
		al.add(new Emp(11, "sam"));
		
		Collections.sort(al,new enamecomp());
		for(Emp e:al)
		{
			System.out.println(e.id+" "+e.ename);
		}
		

	}

}
