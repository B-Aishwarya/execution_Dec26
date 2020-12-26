package com.xworkz.cityWard.city;

import com.xworkz.cityWard.city.Constants.WardName;

public class CityWard {

	private String corporationName;
	private long area;
	private WardName wardName;

	public CityWard(String corporationName, long area, WardName wardName) {
		this.area = area;
		this.corporationName = corporationName;
	}

	public WardName getWardName() {
		return wardName;
	}

	public void setWardName(WardName wardName) {
		this.wardName = wardName;
	}

	public String getCorporationName() {
		return corporationName;
	}

	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}

	public long getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}

}
