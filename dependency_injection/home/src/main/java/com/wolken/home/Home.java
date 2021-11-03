package com.wolken.home;

public class Home {
	private String name;

	public Home(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Home [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void PrintName() {
		System.out.println(name);
	}
	
	

}
