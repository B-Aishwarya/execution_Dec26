package com.xworkz.cityWard.city;

import com.xworkz.cityWard.city.CityWard;
import com.xworkz.cityWard.city.Constants.WardName;
import com.xworkz.cityWard.city.WardInfo;

public class AcceptCity {
	public WardInfo wardInfo;
	public CityWard cityWar;

public void addWard(int wardNumber, WardName wardName,long population) {
	if (wardName != null && wardNumber >0 &&  population<=5000 ) {
		this.wardInfo =new WardInfo(wardNumber,wardName,population);
		System.out.println("city added, data is valid");
	} else {
		System.out.println("provide proper details,data is invalid");
	}
	
	
	
	
	public boolean cityWard(WardInfo wardInfo)
	{
		if (this.wardInfo != null) {
			System.out.println(this.wardInfo.getPopulation());
			System.out.println(this.wardInfo.getWardName());
			System.out.println(this.wardInfo.getWardNumber());
			
		} else {
			System.out.println("city ward is not there :: null");
			return cityWard;
		}
	}
}
}