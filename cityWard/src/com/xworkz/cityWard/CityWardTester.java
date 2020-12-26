package com.xworkz.cityWard;

import java.io.ObjectInputStream.GetField;

import com.xworkz.cityWard.city.CityWard;
import com.xworkz.cityWard.city.Constants.WardName;
import com.xworkz.cityWard.city.WardInfo;
import com.xworkz.cityWard.city.AcceptCity;

public class CityWardTester {

	public static void main(String[] args) {
		WardInfo ward = new WardInfo(12, WardName.JAYANAGAR, 750);
		System.out.println("Ward Population is " + ward.getPopulation());
		System.out.println(" WardNumber is " + ward.getWardNumber());
		System.out.println(" WardName is " + ward.getWardName());
		

		CityWard city = new CityWard("BBMP", 98768l, WardName.RAJAJINAGAR);
		System.out.println("corporation name is " + city.getCorporationName());
		System.out.println("total area of city is " + city.getArea());

		//AcceptCity accept = new AcceptCity();
       // accept.addWard(122, WardName.COTTONPETE, 1234l);
		

	}

}
