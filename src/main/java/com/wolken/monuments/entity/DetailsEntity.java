package com.wolken.monuments.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@NoArgsConstructor
public class DetailsEntity {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Id
	@GenericGenerator(name="priya", strategy="increment")
	@GeneratedValue(generator="priya")
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String location;
	@Column
	private float entryFee;
	@Column
	private short YOC;
	@Override
	public String toString() {
		return "DetailsEntity [id=" + id + ", name=" + name + ", location=" + location + ", entryFee=" + entryFee
				+ ", YOC=" + YOC + "]";
	}
}
