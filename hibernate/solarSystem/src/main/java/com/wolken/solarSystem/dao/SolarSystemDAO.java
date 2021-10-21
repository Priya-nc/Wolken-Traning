package com.wolken.solarSystem.dao;

import com.wolken.solarSystem.entity.SolarSystemDetails;

public interface SolarSystemDAO {

	boolean save(SolarSystemDetails details);
	boolean delete(SolarSystemDetails details);
	boolean update(SolarSystemDetails details);
	void get(String p_name);
}
