package com.mc.TourSeries;

public class Airline {
	
	private String country; //나라(목적지) 
	private int mileage; //마일리지 
	private int airfare; //항공 가격
	
	
	//기본 생성자
	public Airline() {
		
	}

	//매개변수 3개 있는 생성자
	public Airline(String country, int mileage, int airfare) {
		super();
		this.country = country;
		this.mileage = mileage;
		this.airfare = airfare;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getAirfare() {
		return airfare;
	}

	public void setAirfare(int airfare) {
		this.airfare = airfare;
	}
	
	
	
	

	
}
