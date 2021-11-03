package com.wolken.home;

public class Home {
	private String name;
	private Furniture fur;

	public Home(String name,Furniture fur) {
		super();
		this.name = name;
		this.fur=fur;
	}

	@Override
	public String toString() {
		return "Home [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void PrintName() {
		System.out.println(name+"   "+fur);
	}
	
	

}
