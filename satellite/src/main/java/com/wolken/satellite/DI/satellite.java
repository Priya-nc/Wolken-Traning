package com.wolken.satellite.DI;

public class satellite {

	private String name;

	public satellite() {
		System.out.println("default constructor");
	}

	

	public satellite(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void PrintName() {
		System.out.println(name);
	}
	@Override
	public String toString() {
		return "satellite [name=" + name + "]";
	}
	
	
	
	
	
}
