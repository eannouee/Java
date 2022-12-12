package com.mc.CoffeeManagerSeries;

import java.time.LocalDate;

public class TSeasonCoffee extends TCoffee { //커피라는 개념에 포함된 클래스

	private int[] season; //판매되는 월을 int 배열로 받을 거임

	public TSeasonCoffee(String name, int stock, int totalSalesCnt, int safetyStock, int cost, int price, int[] season) {
		super(name, stock, totalSalesCnt, safetyStock, cost, price);
		this.season = season;
	}
	
	public boolean isSeason() {
		
		int nowMonth = LocalDate.now().getMonthValue();
		
		for(int month : season) {
			if(nowMonth == month) {
				return true;
			}
		}
		return false;
	}
	
	
	
	

}
