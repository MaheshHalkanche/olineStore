package com.comparator;

import java.util.Comparator;

public class PidSort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		product e1 = (product)o1;
		product e2 = (product)o2;
		if(e1.id==e2.id)			
			return 0;
		else if(e1.id>e2.id)
			return 1;
		else 
			return -1;
	}

}
