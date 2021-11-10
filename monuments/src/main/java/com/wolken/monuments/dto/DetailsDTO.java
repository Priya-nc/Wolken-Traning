package com.wolken.monuments.dto;

import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class DetailsDTO {

	private String name;
	private String location;
	private float entryFee;
	private short YOC;
	
	public DetailsDTO() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getEntryFee() {
		return entryFee;
	}
	public void setEntryFee(float entryFee) {
		this.entryFee = entryFee;
	}
	public short getYOC() {
		return YOC;
	}
	public void setYOC(short yOC) {
		YOC = yOC;
	}
	@Override
	public String toString() {
		return "DetailsDTO [name=" + name + ", location=" + location + ", entryFee=" + entryFee + ", YOC=" + YOC + "]";
	}
}
