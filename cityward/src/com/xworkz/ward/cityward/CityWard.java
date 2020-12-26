package com.xworkz.ward.cityward;


import com.xworkz.ward.constants.City;

public class CityWard {
	private int wardnumber;
	private String wardname;
	private String corporatorname;
	private int population;
	private int area;
	private City[] city=new City[4];
	
	public CityWard() {
		System.out.println("created default constructor");
		}
	

	public CityWard(int wardnumber, String wardname, String corporatorname, int population, int area) {
		System.out.println("invoked cityward");
		
	}
	
	public CityWard(String wardname, String corporatornamer) {
		this.wardname= wardname;
		this.corporatorname=corporatornamer;
	}
	public CityWard( int wardnumber, int population, int area) {
		this.wardnumber= wardnumber;
		this.population=population;
		this.area=area;
	}
	
	public void displayCity() {
		City[] city = this.city;
		for (int i = 0; i < city.length; i++) {
			City value = city[i];
		System.out.println("display");
		System.out.println(value.BANGLORE);
		System.out.println(value.DHARWAD);
		System.out.println(value.GADAG);
	}
	


	
		

