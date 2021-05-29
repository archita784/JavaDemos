package com.coforge.serial;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	String name;
	int id;
	transient String hobby;

	public Student(String name, int id, String hobby) {
		super();
		this.name = name;
		this.id = id;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", hobby=" + hobby + "]";
	}

}
