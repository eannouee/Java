package com.mc.TourSeries;

public class Tourist {
	private int myMoney; 
	private int myMile;
	
	//기본 생성자 
	public Tourist() {
		
	}
	
	//매개변수 2개인 생성자 
	public Tourist(int myMoney, int myMile) {
		super();
		this.myMoney = myMoney;
		this.myMile = myMile;
	}
	
	
	public int getMyMoney() {
		return myMoney;
	}
	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	public int getMyMile() {
		return myMile;
	}
	public void setMyMile(int myMile) {
		this.myMile = myMile;
	}
	
	

}
