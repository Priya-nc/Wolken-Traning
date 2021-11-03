package com.wolken.home;

public class Furniture {
	
	
	private String fname;

	@Override
	public String toString() {
		return "Furniture [fname=" + fname + "]";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void printFurnitureName() {
		System.out.println(fname);
	}
	

}
