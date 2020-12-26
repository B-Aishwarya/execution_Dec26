package com.xworkz.cityWard.city;

import com.xworkz.cityWard.city.CityWard;
import com.xworkz.cityWard.city.Constants.WardName;

public class WardInfo {
	public int wardNumber;
	public WardName wardName;
	public long population;

	public WardInfo(int wardNumber, WardName wardName, long population) {
		System.out.println("init ward information");
		this.wardName = wardName;
		this.population = population;
		this.wardNumber = wardNumber;

	}
	
	

	public int getWardNumber() {
		return wardNumber;
	}

	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}

	public WardName getWardName() {
		return wardName;
	}

	public void setWardName(WardName wardName) {
		this.wardName = wardName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

}
