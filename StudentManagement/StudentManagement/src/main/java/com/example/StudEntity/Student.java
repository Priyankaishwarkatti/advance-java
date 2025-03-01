package com.example.StudEntity;

public class Student {

	private long id;

	private String name;

	private int rollCall;

	public Student() {
		super();
	}

	public Student(long id, String name, int rollCall) {
		super();
		this.id = id;
		this.name = name;
		this.rollCall = rollCall;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollCall() {
		return rollCall;
	}

	public void setRollCall(int rollCall) {
		this.rollCall = rollCall;
	}

}
