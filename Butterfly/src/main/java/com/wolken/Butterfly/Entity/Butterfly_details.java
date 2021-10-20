package com.wolken.Butterfly.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Butterfly_details")
public class Butterfly_details {
	@Id
	@Column(name="type")
	private String type;
	
	@Column(name="name")
	private String name;
	
	@Column(name="length")
	private int length;
	
	@Column(name="gender")
	private String gender;

	public String getType() {
		return type;
	}

	

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Butterfly_details [type=" + type + ", name=" + name + ", length=" + length + ", gender=" + gender + "]";
	}
	

}
