package com.comparator;

import java.util.Comparator;

public class pnamecomp implements Comparator<product>  {

	@Override
	public int compare(product o1, product o2) {
		// TODO Auto-generated method stub
		return o1.pname.compareTo(o2.pname);
	}

}
