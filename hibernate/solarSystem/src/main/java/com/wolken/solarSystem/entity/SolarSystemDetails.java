package com.wolken.solarSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solarsystem_details")
public class SolarSystemDetails {
	
	@Id
	@Column
	private String p_name;
	
	@Column
	private int p_size;
	
	@Column
	private float temperature;
	
	@Column
	private int mass;

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_size() {
		return p_size;
	}

	public void setP_size(int p_size) {
		this.p_size = p_size;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	@Override
	public String toString() {
		return "SolarSystemDetails [p_name=" + p_name + ", p_size=" + p_size + ", temperature=" + temperature
				+ ", mass=" + mass + "]";
	}

}
