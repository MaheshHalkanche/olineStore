package com.serializationx;

import java.io.Serializable;

public class Emp implements Serializable {
	int id;
	transient String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
