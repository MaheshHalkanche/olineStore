package com.mapEx;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class maptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Emp,student> h = new LinkedHashMap<Emp, student>();
		h.put(new Emp(1, "mahesh"), new student(1, "mahesh"));
		h.put(new Emp(2, "javed"), new student(2, "javed"));
		h.put(new Emp(3, "girish"), new student(3, "girish"));
		h.put(new Emp(4, "raghav"), new student(4, "raghav"));
		
		Set<Emp> e = h.keySet();		
				
		for(Emp e2:e)
		{
			System.out.println("emp data:::"+e2.id+"+++++"+e2.name);
		}
		
		for(student s:h.values())
		{
			System.out.println("student:::"+s.sid+"======"+s.sname);
		}
		Set<Entry<Emp, student>> ee = h.entrySet();
		Iterator<Entry<Emp,student>> itr =ee.iterator();
		while(itr.hasNext())
		{
		Entry<Emp, student> es =	itr.next();
		Emp e1 =es.getKey();
		System.out.println("emp data:::"+e1.id+"=============="+e1.name);
		
		student s1 = es.getValue();
		System.out.println("student data:::"+s1.sid+"==========="+s1.sname);
		}
		
		
		
		

	}

}
